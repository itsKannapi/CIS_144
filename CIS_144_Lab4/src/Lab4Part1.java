import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab4Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00"); // how we wanted values to be formatted in the table

        //declare arrays and their length values
        String[] students = new String[5];
        double[][] grades = new double[5][6];
        int lenR = grades.length;
        int lenC = grades[0].length;

        // input grades for each "student"
        for (int r = 0; r < lenR; r++) {
            System.out.print("Enter Student Name: ");
            students[r] = sc.nextLine();
            double rowSum = 0;

            for (int c = 0; c < lenC - 1; c++) {
                System.out.print("Enter grade " + (c + 1) + " for " + students[r] + ": ");
                grades[r][c] = sc.nextDouble();
                rowSum += grades[r][c];
            }
            sc.nextLine(); // Clear buffer

            grades[r][lenC - 1] = (rowSum/(lenC - 1)); // last column of the table to be the average values
        }

        // print headers (extra credit)
        System.out.println("\nStudent Grades Table:");
        System.out.printf("%-20s", "Name");
        for (int c = 0; c < lenC - 1; c++) {
            System.out.printf("%8s", "Grade" + (c + 1) + "\t");
        }
        System.out.printf("%8s\n", "Average");

        // Printing the values from each spot of the array
        for (int r = 0; r < lenR; r++) {
            System.out.printf("%-20s", students[r]);
            for (int c = 0; c < lenC; c++) {
                System.out.printf("%8s", df.format(grades[r][c]));
            }
            System.out.println();
        }
    }
}