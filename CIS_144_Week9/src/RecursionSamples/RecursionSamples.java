package RecursionSamples;
import java.util.Scanner;

public class RecursionSamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintHello(5);

        int f = Factorial(6);
        System.out.println("The Factorial of 6: " + f);

        System.out.println("Enter a int to generate the Fibonacci Sequence");
        int c = sc.nextInt();
        for(int i = 0; i < c; i++){
            System.out.println(Fibonacci(i)+ " ");
        }
        System.out.println();
    }
    public static void PrintHello(int x){
        if (x > 0){
            System.out.println("hello World!!!");
            PrintHello(x - 1);
        }
    }

    public static int Factorial(int x){
        if (x == 0){
            return 1;
        }
        else {
           return x * Factorial(x -1 );
        }
    }
    public static int Fibonacci(int x){
        if (x == 0){
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        else {
            return (Fibonacci(x - 1) + Fibonacci(x - 2));
        }
    }
}
