package ExampleCode;
import java.util.Scanner;

public class quizApp {
    public static void main(String[] args) {
        System.out.println("Sakes Analysis");
        System.out.println("=================\n");
        String name;
        double sales = 0;
        double totalSales = 0;
        int x;
        int c = 1;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the Store Location: ");
        name = i.next();
        System.out.println("How many months? ");
        x = i.nextInt();
        while (c <= x){
            System.out.println("Enter the Sales for month " + c + ": ");
            sales = i.nextDouble();
            totalSales = AccSales(totalSales,sales);
            c++;
        }
        System.out.println("The total sales for " + name + " is $" + totalSales);
    }
    public static double AccSales(double t, double s ){
        t = t+s;
        return t;
    }
}
