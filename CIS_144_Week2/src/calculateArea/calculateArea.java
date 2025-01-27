package calculateArea;
import java.util.Scanner;

public class calculateArea {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        double width, height;

        System.out.print("Enter the width as a double: ");
        width = UserInput.nextDouble();
        System.out.print("Enter the height as a double: ");
        height = UserInput.nextDouble();

       CalculateArea(width,height);
    }
    static void CalculateArea(double w, double h){
        double a = w*h;
        System.out.println("Area the rectangle with the width: "+ a);
    }
}
