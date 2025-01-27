package lab1part2;
import java.util.Scanner;

public class Lab1Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total miles driven: ");
        int totalMiles = scanner.nextInt();
        System.out.println("Enter the Cost per Gallon of Gas: ");
        double CostperGallon = scanner.nextDouble();
        System.out.println("Enter the Average Miles per Gallon of the Car: ");
        int MilesperGallon = scanner.nextInt();
        System.out.println("Enter the total amount of parking fees to be paid: ");
        double Parking = scanner.nextDouble();
        System.out.println("Enter the total amount of tolls to be paid: ");
        double Tolls = scanner.nextDouble();

        System.out.println("The total trip cost is: " + CalculateCost(totalMiles,CostperGallon,MilesperGallon,Parking,Tolls));
    }
    public static double CalculateCost(int m, double cpg, int mpg, double p, double t){
        return (((m/mpg)*cpg)+ p + t);
    }
}
