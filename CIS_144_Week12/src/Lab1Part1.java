import java.util.Scanner;

public class Lab1Part1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();

        System.out.println("Highest: " + getMax(n1, n2, n3, n4, n5));
        System.out.println("Lowest: " + getMin(n1, n2, n3, n4, n5));
    }

    public static int getMax(int a, int b, int c, int d, int e) {
        int max = a;
        if (b > max) max = b; if (c > max) max = c; if (d > max) max = d; if (e > max) max = e;
        return max;
    }

    public static int getMin(int a, int b, int c, int d, int e) {
        int min = a;
        if (b < min) min = b; if (c < min) min = c; if (d < min) min = d; if (e < min) min = e;
        return min;
    }
}