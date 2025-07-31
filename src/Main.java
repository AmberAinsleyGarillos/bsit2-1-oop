import java.util.Scanner;

public class Main {
    static String studentID = "";
    static String firstName = "";
    static String lastName = "";
    static String course = "";
    static String section = "";

    static int midtermScore = 0;
    static int finalScore = 0;
    static int projectScore = 0;
    static int attendancePercentage = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student ID: ");
        studentID = scanner.nextLine();

        System.out.print("First Name: ");
        firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        lastName = scanner.nextLine();

        System.out.print("Course: ");
        course = scanner.nextLine();

        System.out.print("Section: ");
        section = scanner.nextLine();

        System.out.println();

        System.out.println(" STUDENT INFORMATION ");
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        System.out.println();

        System.out.print("Midterm Exam Score: ");
        midtermScore = scanner.nextInt();

        System.out.print("Final Exam Score: ");
        finalScore = scanner.nextInt();

        System.out.print("Project Score: ");
        projectScore = scanner.nextInt();

        System.out.print("Attendance Score: ");
        attendancePercentage = scanner.nextInt();


        double averageScore = (midtermScore + finalScore + projectScore + attendancePercentage) / 400.0 * 100;
        System.out.println();

        System.out.println(" STUDENT SCORE ");
        System.out.println("Midterm Exam Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendancePercentage);


        System.out.println();
        System.out.printf("Average Score: %.2f%n", averageScore);

        if (averageScore < 75) {
            System.out.println("Remarks: FAILED");
        } else {
            System.out.println("Remarks: PASSED");
        }

        scanner.close();
    }
}
