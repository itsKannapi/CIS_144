import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MoreArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> years = new ArrayList<>();
        int temp;
        int num;
        System.out.println("How many years are there? ==> ");
        num = sc.nextInt();
        for(int i = 0; i < num; i++)
        {
            System.out.print("Enter the year # " + (i + 1) + " ==> ");
            temp = sc.nextInt();
            years.add(temp);
        }

        System.out.println("Current ArrayList");
        for(int i = 0; i < years.size(); i++)
        {
            System.out.println(years.get(i));
        }

        Collections.sort(years);
        System.out.println("Sorted ArrayList");
        System.out.println();
        for(int i = 0; i < years.size(); i++)
        {
            System.out.println(years.get(i));
        }


//        years.add(2010);
//        years.add(1999);
//        years.add(1968);
//        years.add(2013);
//        years.add(2014);
//        for(int i = 0; i < years.size(); i++)
//        {
//            System.out.println(years.get(i));
//        }
//
//        years.set(3, 1968);
//        System.out.println();
//
//        for(int i = 0; i < years.size(); i++)
//        {
//            System.out.println(years.get(i));
//        }
//
//        years.remove(2);
//        System.out.println();
//        for(int i = 0; i < years.size(); i++)
//        {
//            System.out.println(years.get(i));
//        }
//
//        years.clear();
//        System.out.println();
//        for(int i = 0; i < years.size(); i++)
//        {
//            System.out.println(years.get(i));
//        }

//        Collections.sort(years, Collections.reverseOrder());
//        System.out.println();
//        for(int i = 0; i < years.size(); i++)
//        {
//            System.out.println(years.get(i));
//        }
    }

}
