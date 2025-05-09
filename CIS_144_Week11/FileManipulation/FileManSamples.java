import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManSamples {
    static Scanner sc = new Scanner(System.in);
    static int numEmp;
    static String name;
    static int age;
    static String city;



    public static void main(String[] args) {
        try {
            FileWriter gust = new FileWriter("employee.csv", true);
            System.out.print("How many employees do you want to enter? ==> ");
            numEmp = sc.nextInt();
            sc.nextLine();

            for(int r = 1; r <= numEmp; r++) {
                System.out.print("Enter the name of Employee # " + r + " ==> ");
                name = sc.nextLine();
                System.out.print("Enter the age of Employee # " + r + " ==> ");
                age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the city of Employee # " + r + " ==> ");
                city = sc.nextLine();
                gust.write(name + "," + age + "," + city + "\n");
                System.out.println();

            }
            gust.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

}
