package ExampleCode;
import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char option;
        do {
            System.out.println("Menu of Options");
            System.out.println("=================");
            System.out.println("a. Say Good Morning in Spanish");
            System.out.println("b. Say Good Morning in Portuguese");
            System.out.println("c. Say Good Morning in Italian \n");
            System.out.println("x. Enter 'x' to end\n");
            System.out.print("Enter your option: ");
            option = sc.next().charAt(0);
            switch (option) {
                case 'a':
                    spanish();
                    break;
                case 'b':
                    portuguese();
                    break;
                case 'c':
                    italian();
                case 'x':
                    goodBye();
                    default:
                        Wrong();
                        break;
            }
        } while (option != 'x');
    }
    public static void spanish(){
        System.out.println("Hola Mundo!");
    }
    public static void portuguese(){
        System.out.println("Bom Dia!");
    }
    public static void italian(){
        System.out.println("Buenos dias!");
    }
    public static void goodBye(){
        System.out.println("Goodbye!");
    }
    public static void Wrong(){
        System.out.println("Wrong Option!!!");
    }
}
