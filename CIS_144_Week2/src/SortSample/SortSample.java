package SortSample;

public class SortSample {
    public static void main(String[] args) {
        int a = 25, b = 40, c = 120;
        int high = 0;
        int low = a;

        if(a > high){
            high = a;
        }
        if(b > high){
            high = b;
        }
        if(c > high){
            high = c;
        }
        System.out.println("The highest is: " + high);
        if(a < low){
            low = a;
        }
        if(b < low){
            low = b;
        }
        if(c < low){
            low = c;
        }
        System.out.println("The lowest is: " + low);
    }
}
