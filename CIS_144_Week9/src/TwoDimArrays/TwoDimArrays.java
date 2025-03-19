package TwoDimArrays;

public class TwoDimArrays {
    public static void main(String[] args) {
        int x[][]= {{10,11,12,13,14}, {20, 21,22,23,24},{30,31,32,33,34},{40,41,42,43,44}};
        for (int r = 0; r < 4 ; r++){
            for (int c = 0; c < 5; c++){
                System.out.println(x[r][c]+ " ");
            }
            System.out.println();
        }
    }
}
