/**
 * @(#)Demonstration.java
 *
 *
 * @author 
 * @version 1.00 2023/10/18
 */
import java.util.Scanner;

public class Demonstration {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input user information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your registration number: ");
        String regNumber = scanner.nextLine();
        System.out.print("Enter your school: ");
        String school = scanner.nextLine();
        System.out.print("Enter your year of study: ");
        int yearOfStudy = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the course taken: ");
        String course = scanner.nextLine();

        // Input CAT and main exam marks
        System.out.print("Enter CAT marks: ");
        double catMarks = scanner.nextDouble();
        System.out.print("Enter main exam marks: ");
        double examMarks = scanner.nextDouble();

        // Calculate the overall grade
        double totalMarks = catMarks + examMarks;
        char overallGrade;

        if (totalMarks >= 70) {
            overallGrade = 'A';
        } else if (totalMarks >= 60) {
            overallGrade = 'B';
        } else if (totalMarks >= 50) {
            overallGrade = 'C';
        } else if (totalMarks >= 40) {
            overallGrade = 'D';
        } else {
            overallGrade = 'E';
        }

        // Display the user's information and results
        System.out.println("\n*** Student Information ***");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNumber);
        System.out.println("School: " + school);
        System.out.println("Year of Study: " + yearOfStudy);
        System.out.println("Course Taken: " + course);

        System.out.println("\n*** Marks and Grade ***");
        System.out.println("CAT Marks: " + catMarks);
        System.out.println("Main Exam Marks: " + examMarks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Overall Grade: " + overallGrade);
    }
}
    
    
    
