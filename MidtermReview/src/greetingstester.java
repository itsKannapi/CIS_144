import java.util.Scanner;

public class greetingstester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int year;
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter the year you were born: ");
        year = sc.nextInt();

        greetings g = new greetings(name, year);
        g.PrintMessage();
    }
}
