import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final String USER_FILE = "users.txt";
    static String username;
    static int x=0;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        createFileIfNotExists();

        
        System.out.println("Welcome to the Login System!");

        while (x==0) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    login(scanner);
                    System.out.println("enter choice");
                    System.out.println("1. course management");
                    System.out.println("2. assignemnt");
                    System.out.println("3. quiz");
                    System.out.println("4. discussion forum");
                    System.out.println("5. video conferencing");
                    int n = scanner.nextInt();
                    switch(n){
                        case 1:
                        new CourseManagementSystem();
                        break;
                        case 2:
                        new AssignmentManagementSystem();
                        break;
                        case 3:
                        new QuizzesManagementSystem();
                        break;
                        case 4:
                        DiscussionForum.discussionMenu(username);
                        case 5:
                        videoConferencing();
                        break;
                        default:
                        System.out.println("Invalid choice. Please try again.");
                    break;

                    }
                    
                    break;
                case 2:
                    register(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void createFileIfNotExists() {
        try {
            File file = new File(USER_FILE);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void login(Scanner scanner) {
        System.out.println("\n--- Login ---");
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String storedUsername = parts[0];
                String storedPassword = parts[1];

                if (username.equals(storedUsername) && password.equals(storedPassword)) {
                    System.out.println("Login successful! Welcome, " + username + ".");
                    x=1;
                    return;
                }
            }
            System.out.println("Invalid username or password.");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }

    static void videoConferencing(){
        System.out.println("video conferencing has started");
        System.out.println("press 0 to end");
        int b = scanner.nextInt();
        if (b==0){
            System.out.println("video conferencing has ended");
        }

    }
    private static void register(Scanner scanner) {
        System.out.println("\n--- Register ---");
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE, true))) {
            writer.write(username + ":" + password);
            writer.newLine();
            writer.flush();
            System.out.println("Registration successful! You can now login with your credentials.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
