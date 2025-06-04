import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeTracker tracker = new GradeTracker();
        int choice;

        do {
            System.out.println("\n--- Student Grade Tracker ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade to Student");
            System.out.println("3. Show All Reports");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    scanner.nextLine(); // clear buffer
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    tracker.addStudent(name, id);
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    int sid = scanner.nextInt();
                    Student student = tracker.findStudentById(sid);
                    if (student != null) {
                        System.out.print("Enter Marks to add: ");
                        int grade = scanner.nextInt();
                        student.addGrade(grade);
                        System.out.println("Grade added.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    tracker.showAllReports();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
