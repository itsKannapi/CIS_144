package lab1part1;

import java.util.Scanner;
import java.util.Arrays;

public class Lab1Part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[5]; // Fixed array size issue

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter integer #" + (i + 1) + ":");
            integers[i] = scanner.nextInt();
        }

        Arrays.sort(integers); // Sorting makes min = first element, max = last element

        System.out.println("Highest: " + getHighest(integers));
        System.out.println("Lowest: " + getLowest(integers));
    }

    public static int getHighest(int[] arr) {
        return arr[arr.length - 1]; //
    }

    public static int getLowest(int[] arr) {
        return arr[0];
    }
}

