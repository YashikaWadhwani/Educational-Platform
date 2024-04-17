import java.util.Scanner;

public class AssignmentManagementSystem {
    private static String[] assignment = {"Mathematics", "English", "History", "Biology", "Chemistry", "Physics"};
    private static String[] myAssignment = {"Mathematics", "English", "History", "Biology", "Chemistry", "Physics"};
    private static int myAssignmentCount = assignment.length;
    static Scanner scanner = new Scanner(System.in);
    public AssignmentManagementSystem() {
        
        int choice;

        do {
            System.out.println("\n===== assignment   Management System =====");
            System.out.println("1. Show all available assignment ");
            System.out.println("2. submit");
            System.out.println("3. Show all pending assignments in my list");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showAllAssignment();
                    break;
                case 2:
                    submitAssignment(scanner);
                    break;
                     case 3:
                    showPendingAssignment();
                    break;
                case 0:
                    System.out.println("goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }

    private static void showAllAssignment() {
        System.out.println("\n=== Available assignment ===");
        for (int i = 0; i < myAssignment.length; i++) {
            if(myAssignment[i]!=null){
                System.out.println(i + 1 + ". " +myAssignment[i]);
            }
        }
    }

    
    private static void submitAssignment(Scanner scanner) {

        System.out.println("\n===assignments ===");
        for (int i = 0; i < assignment.length; i++) {
            System.out.println(i + 1 + ". " +assignment[i]);
        }
        System.out.print("\nEnter the assignment number you want to submit: ");
        int assignmentIndex = scanner.nextInt() - 1;

        if ( assignmentIndex >= 0 && assignmentIndex < myAssignmentCount) {
            int j;
            String submitAssignment = myAssignment[assignmentIndex];
            for (j = assignmentIndex; j < myAssignmentCount - 1; j++) {
                myAssignment[j] = myAssignment[j + 1];
            }
            myAssignmentCount--;
            myAssignment[j]=null;
            System.out.println(submitAssignment + " has been submitted from your list.");
        } else {
            System.out.println("Invalid assignment number. Please try again.");
        }
    }
    private static void showPendingAssignment() {
        System.out.println("\n=== assignment in My List ===");
        for (int i = 0; i < myAssignmentCount; i++) {
            System.out.println(i + 1 + ". " + myAssignment[i]);
        }
    }

    
}