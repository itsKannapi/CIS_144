import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateCSV {
    static Scanner sc = new Scanner(System.in);
    static String StoreName;
    static double JanSales;
    static double FebSales;
    static double MarSales;
    static double AprSales;

    public static void main(String[] args) {
        try {
            System.out.print("Enter the filename (FileName.csv): ");
            String filename = sc.nextLine();
            FileCreator BestBuy = new FileCreator(filename);

            for(int r = 1; r <= 5; r++) {
                System.out.print("Enter the Store Location: ");
                StoreName = sc.nextLine();
                System.out.print("Enter the January Sales: ");
                JanSales = sc.nextDouble();
                System.out.print("Enter the February Sales: ");
                FebSales = sc.nextDouble();
                System.out.print("Enter the March Sales: ");
                MarSales = sc.nextDouble();
                System.out.print("Enter the April Sales: ");
                AprSales = sc.nextDouble();

                sc.nextLine(); // <-- This line consumes the leftover newline

                BestBuy.WriteFile(StoreName, JanSales, FebSales, MarSales, AprSales);
                System.out.println();
            }
            BestBuy.CloseFile();
            System.out.println("CSV file successfully made...");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
