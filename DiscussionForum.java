import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiscussionForum {
    private List<Comments> comments;
    private File dataFile;

    public DiscussionForum() {
        comments = new ArrayList<>();
        dataFile = new File("forum_data.ser");
        loadComments();
    }

    private void loadComments() {
        if (dataFile.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dataFile))) {
                comments = (List<Comments>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveComments() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dataFile))) {
            oos.writeObject(comments);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void postComment(String author, String content) {
        Comments comment = new Comments(author, content);
        comments.add(comment);
        saveComments();
        System.out.println("Comment posted: " + comment);
    }

    public void deleteComment(int index) {
        if (index >= 0 && index < comments.size()) {
            Comments comment = comments.remove(index);
            saveComments();
            System.out.println("Comment deleted: " + comment);
        } else {
            System.out.println("Invalid comment index!");
        }
    }

    public void displayComments() {
        System.out.println("Discussion Forum Comments:");
        for (int i = 0; i < comments.size(); i++) {
            System.out.println((i + 1) + ". " + comments.get(i));
        }
    }

    public static void discussionMenu(String username) {
        DiscussionForum forum = new DiscussionForum();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Discussion Forum ===");
            System.out.println("1. Post a comment");
            System.out.println("2. Delete a comment");
            System.out.println("3. Display comments");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    String author = username;
                    System.out.print("Enter comment content: ");
                    String content = scanner.nextLine();
                    forum.postComment(author, content);
                    break;
                case 2:
                    System.out.print("Enter the index of the comment to delete: ");
                    int index = scanner.nextInt();
                    forum.deleteComment(index - 1);
                    break;
                case 3:
                    forum.displayComments();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

