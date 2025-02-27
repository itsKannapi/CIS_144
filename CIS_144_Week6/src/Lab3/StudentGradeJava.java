package Lab3;
import java.util.Scanner;

public class StudentGradeJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numGrades;
        String studentName;

        System.out.println("Enter student name: ");
        studentName = scanner.nextLine();
        Student student = new Student(studentName);

        System.out.println("Enter the number of grades: ");
        numGrades = scanner.nextInt();

        int temp = 0;
        while (temp < numGrades) {
            System.out.print("Enter grade " + (temp + 1) + " (0-100): ");
            double grade = scanner.nextDouble();

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a number between 0 and 100.");
                continue;
            }

            student.AddAverage(grade);
            temp++;
        }

        // Calculate and display final results
        double finalAverage = student.CalcAverage();
        String letterGrade = student.GetLetterGrade();

        System.out.println("\nFinal Results:");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Final Average: " + finalAverage);
        System.out.println("Letter Grade: " + letterGrade);

        scanner.close();
    }
}

