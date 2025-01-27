package calculateAreaCircle;
import java.util.Scanner;

public class calculateAreaCircle {
    final static double Pi = Math.PI;
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        double radius;

        System.out.print("Enter the radius as a double: ");
        radius = UserInput.nextDouble();

        CalculateArea(radius);
    }
    static void CalculateArea(double r){
        double a = Pi * (r*r);
        System.out.println("Area the circle with the width: "+ a);
    }
}
