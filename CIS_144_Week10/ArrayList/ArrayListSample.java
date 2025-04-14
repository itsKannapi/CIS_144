import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSample {
    public static void main(String[] args) {
        double sale;
        double totalSales = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Double>> sales = new ArrayList<>();
        for (int r = 0; r < 4; r++){
            for (int c = 0; c < 5; c++){
                sales.add(new ArrayList<Double>());
                System.out.println("Enter sales row number " + (r+1) + "Columns # " + (c+1) + ": ");
                sale = sc.nextInt();
                sales.get(r).add(c, sale);
                totalSales += sale;
            }
            sales.get(r).add(5, totalSales);
            System.out.println();
        }
        for(int r = 0; r < 4; r++){
            for (int c = 0; c < 6; c++){
                System.out.println(sales.get(r).get(c) + "\t");
            }
            System.out.println();
        }
    }
}
