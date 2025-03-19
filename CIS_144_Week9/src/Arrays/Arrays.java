package Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = {2010, 2025, 1990, 1981, 1984};

        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }

        int [] y = new int[5];
        for (int i = 0; i < y.length; i++){
            System.out.println("Enter x["+i+"] ==> ");
            y[i] = sc.nextInt();
        }

        System.out.println("\nCurrent Array: ");
        for (int i = 0; i < y.length; i++){
            System.out.println("Enter x["+i+"] ==> " +y[i]);
        }

        modifyArray(y);
        System.out.println("\nCurrent Array: ");
        for (int i = 0; i < y.length; i++){
            System.out.println("Enter x["+i+"] ==> " +y[i]);
        }
        BubbleSort(x);
        System.out.println("\nCurrent Array: ");
        for (int i = 0; i < x.length; i++){
            System.out.println("Enter x["+i+"] ==> " +x[i]);
        }
    }

    public static void modifyArray(int [] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + 10;

        }
    }

    public static void BubbleSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
