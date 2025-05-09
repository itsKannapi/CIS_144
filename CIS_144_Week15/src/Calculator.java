//import from java gui calculator
public class Calculator {
    private double n1;
    private double n2;
    private double total;

    Calculator(){

    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    void Addition(){
        this.total = this.n1 + this.n2;
    }
    void Subtraction(){
        this.total = this.n1 - this.n2;
    }
}
