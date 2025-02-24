package ExampleCode;
import java.util.Scanner;

public class BestBuyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int month;
        double sales;

        System.out.println("Best Buy Sales Analysis");
        System.out.println("=========================\n");
        System.out.print("Enter the store location: ");
        name = sc.nextLine();
        Sales s1 = new Sales(name);

        System.out.print("Enter the # of months to analyze: ");
        month = sc.nextInt();

        for (int i = 1; i <= month; i++) {
            System.out.println("Enter the sale of month " + i + ": ");
            sales = sc.nextDouble();
            s1.AccumSales(sales);
        }

        System.out.println("\n Store Location: " + s1.getName());
        System.out.println("Total Sales: $" + s1.getTotalSales());
        System.out.println("Average Sales: $" + s1.getCalcAverage(month));
    }
}
