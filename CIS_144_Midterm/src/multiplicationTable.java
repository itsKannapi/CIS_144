public class multiplicationTable {
    public static void main(String[] args) {
        int x = 12;
        while (x >= 1){
            System.out.println("Table of " + x + " in Reverse");
            int y = 12;
            while (y >= 1) {
                System.out.println(x + " * " + y + " = " + (x*y));
                y--;
            }
            x--;
        }
    }
}
