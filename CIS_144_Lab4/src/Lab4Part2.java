import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab4Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");

        // declare ArrayLists and their length values
        ArrayList<String> students = new ArrayList<>();
        ArrayList<ArrayList<Double>> grades = new ArrayList<>();
        int numStudents = 5;
        int numGrades = 5;

        // input grades for each "Student"
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            students.add(name);

            ArrayList<Double> studentGrades = new ArrayList<>();
            double sum = 0;

            for (int j = 0; j < numGrades; j++) {
                System.out.print("Enter grade " + (j + 1) + " for " + name + ": ");
                double grade = sc.nextDouble();
                studentGrades.add(grade);
                sum += grade;
            }
            sc.nextLine(); // Clear buffer

            // Add average as last element
            double average = sum / numGrades;
            studentGrades.add(average);
            grades.add(studentGrades); // last column of the table to be the average values
        }

        // print headers (extra credit)
        System.out.println("\nStudent Grades Table:");
        System.out.printf("%-20s", "Name");
        for (int c = 0; c < numGrades; c++) {
            System.out.printf("%8s", "Grade" + (c + 1) + "\t");
        }
        System.out.printf("%8s\n", "Average");

        // Printing the values frome ach spot of the array
        for (int i = 0; i < students.size(); i++) {
            System.out.printf("%-20s", students.get(i));
            ArrayList<Double> studentGrades = grades.get(i);
            for (double grade : studentGrades) {
                System.out.printf("%8s", df.format(grade));
            }
            System.out.println();
        }
    }
}

