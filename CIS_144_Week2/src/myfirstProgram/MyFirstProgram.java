package myfirstProgram;
import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        int Hours;
        double PayRate;

        System.out.print("Enter the hours as an Integer: ");
        Hours = UserInput.nextInt();
        System.out.print("Enter the Pay rate as a double: ");
        PayRate = UserInput.nextDouble();

        System.out.println("Your Payment is => " +  CalcPay(Hours,PayRate));
        if(Hours > 40){
            System.out.println("You are working Overtime!!! D:");
        }
        else{
            System.out.println("Thank you for Using the App!!! <3");
        }
    }
    static double CalcPay(int h, double pr){
        if (h > 40){
            return h * pr * 1.5;
        }
        else{
            return h * pr;
        }
    }
}