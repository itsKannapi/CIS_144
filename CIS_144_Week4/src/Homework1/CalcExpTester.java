package Homework1;

import java.util.Scanner;

public class CalcExpTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Creating an instance of CalcExp
        CalcExp calc = new CalcExp();

        // get the user input
        System.out.println("Enter the total miles driven: ");
        calc.setTotMiles(scanner.nextDouble());
        System.out.println("Enter the Cost per Gallon of Gas: ");
        calc.setGasPrice(scanner.nextDouble());
        System.out.println("Enter the Average Miles per Gallon of the Car: ");
        calc.setMilesPerGallon(scanner.nextDouble());
        System.out.println("Enter the total amount of parking fees to be paid: ");
        calc.setParkFees(scanner.nextDouble());
        System.out.println("Enter the total amount of tolls to be paid: ");
        calc.setTollsFees(scanner.nextDouble());

        // Calculations
        calc.CalcTotGallons();
        calc.CalcGasExp();
        calc.CalcTotExpense();

        // Display total trip cost
        System.out.println("The total trip cost is: $" + calc.getTotExpense());
    }
}
