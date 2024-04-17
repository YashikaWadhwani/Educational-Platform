import java.util.*;
public class CourseManagementSystem {
    private static String[] courses = {"Mathematics", "English", "History", "Biology", "Chemistry", "Physics"};
    private static String[] myCourses = new String[10];
    private static int myCoursesCount = 0;
    static Scanner sc = new Scanner(System.in);


    public CourseManagementSystem() {
        
        int choice;

        do {
            System.out.println("\n===== Course Management System =====");
            System.out.println("1. Show all available courses");
            System.out.println("2. Add course to my list");
            System.out.println("3. Remove course from my list");
            System.out.println("4. Show all courses in my list");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    showAllCourses();
                    break;
                case 2:
                    addCourse();
                    break;
                case 3:
                    removeCourse();
                    break;
                case 4:
                    showMyCourses();
                    break;
                case 0:
                    System.out.println("Thank you for using the Course Management System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }


    private static void showAllCourses() {
        System.out.println("\n=== Available Courses ===");
        for (int i = 0; i < courses.length; i++) {
            System.out.println(i + 1 + ". " + courses[i]);
        }
    }


    private static void addCourse() {
        System.out.print("\nEnter the course number you want to add: ");
        int courseIndex = sc.nextInt() - 1;


        if (courseIndex >= 0 && courseIndex < courses.length) {
            if (myCoursesCount < myCourses.length) {
                myCourses[myCoursesCount++] = courses[courseIndex];
                System.out.println(courses[courseIndex] + " has been added to your list.");
            } else {
                System.out.println("Your list is full. Please remove a course to add another one.");
            }
        } else {
            System.out.println("Invalid course number. Please try again.");
        }
    }


    private static void removeCourse() {
        System.out.print("\nEnter the course number you want to remove: ");
        int courseIndex = sc.nextInt() - 1;


        if (courseIndex >= 0 && courseIndex < myCoursesCount) {
            String removedCourse = myCourses[courseIndex];
            for (int i = courseIndex; i < myCoursesCount - 1; i++) {
                myCourses[i] = myCourses[i + 1];
            }
            myCoursesCount--;
            System.out.println(removedCourse + " has been removed from your list.");
        } else {
            System.out.println("Invalid course number. Please try again.");
        }
    }


    private static void showMyCourses() {
        System.out.println("\n=== Courses in My List ===");
        for (int i = 0; i < myCoursesCount; i++) {
            System.out.println(i + 1 + ". " + myCourses[i]);
            
        }
    }
}