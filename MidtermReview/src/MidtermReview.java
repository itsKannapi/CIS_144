public class MidtermReview {
    public static void main(String[] args) {
        for(int i = 0; i <= 12 ;i++){
            System.out.println(i);
        }
        for(int i = 12; i >= 1 ;i--){
            System.out.println(i);
        }
        int x = 1;
        while (x<=12) {
            System.out.println(x);
            x++;
        }
        do {
            System.out.println(x);
            x++;
        }while(x<=12);
        for(int r = 1; r <= 12; r++){
            System.out.println("Outer loop #" + r);
            for(int c = 1; c <= 12; c++){
                System.out.println("\tInner loop #"+ c);
            }
        }

        int c = 1;
        int r = 1;
        while(r<=12){
            System.out.println("Outer loop #" + r);
            while (c<=12){
                System.out.println("\tInner loop #"+ c);
                c++;
            }
            r++;
            c = 1;
        }
    }
}