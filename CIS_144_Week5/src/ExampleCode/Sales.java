package ExampleCode;

public class Sales {
    String name;
    double TotalSales;
    public Sales(String name) {
        this.name = name;
    }
    public void AccumSales(double s){
        this.TotalSales += s;
    }
    public String getName() {
        return this.name;
    }
    public double getTotalSales() {
        return this.TotalSales;
    }
    public double getCalcAverage(int m){
        return this.TotalSales/m;
    }
}
