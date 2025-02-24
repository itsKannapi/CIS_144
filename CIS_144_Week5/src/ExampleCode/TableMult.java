package ExampleCode;

public class TableMult {
    public static void main(String[] args) {
        int c = 1;
        int r = 1;
        System.out.println("The Multiplication Table App");
        System.out.println("============================");
        while (r <= 12){
            System.out.println("\n The table of " + r);
            System.out.println("============");
            while (c<=12){
                System.out.println(r + " * " + c + " = " + (r*c));
                c++;
            }
            c = 1;
            r++;
        }
    }
}
