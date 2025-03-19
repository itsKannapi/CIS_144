import java.util.Scanner;
public class DateClassTester {
    public static void main(String[] args) {
        int month;
        int day;
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.println("Date Format App");
        System.out.println("====================");

        System.out.print("\nEnter the month as an Integer ==> ");
        month = sc.nextInt();
        System.out.print("Enter the day as an Integer ==> ");
        day = sc.nextInt();
        System.out.print("Enter the year as an Integer ==> ");
        year = sc.nextInt();

        DateClass dc = new DateClass(month,day,year);
        dc.PrintMonth();

    }
}
