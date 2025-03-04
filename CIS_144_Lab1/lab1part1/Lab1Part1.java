package lab1part1;

import java.util.Scanner;

public class Lab1Part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer #1:");
        int firstNumber = scanner.nextInt();

        // Initialize highest and lowest with the first input
        int highest = firstNumber;
        int lowest = firstNumber;

        for (int i = 2; i <= 5; i++) { // Start from 2 since we already took first input
            System.out.println("Enter integer #" + i + ":");
            int num = scanner.nextInt();

            highest = getHighest(highest, num);
            lowest = getLowest(lowest, num);
        }

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }

    public static int getHighest(int currentHighest, int newNumber) {
        return Math.max(currentHighest, newNumber);
    }

    public static int getLowest(int currentLowest, int newNumber) {
        return Math.min(currentLowest, newNumber);
    }
}


