package lab1part1;

public class Lab1Part1 {
    public static void main(String[] args) {
        int a = 60, b = 90, c = 20, d = 1000, e = 10;

        System.out.println("Highest: " + getHighest(a, b, c, d, e));
        System.out.println("Lowest: " + getLowest(a, b, c, d, e));
    }
    public static int getHighest(int a, int b, int c, int d, int e) {
        return Math.max(Math.max(Math.max(a, b), Math.max(c, d)), e); // Single line method
    }
    public static int getLowest(int a, int b, int c, int d, int e) {
        return Math.min(Math.min(Math.min(a, b), Math.min(c, d)), e); // Single line method
    }

}
