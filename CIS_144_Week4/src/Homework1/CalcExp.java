package Homework1;

public class CalcExp {
    private double TotMiles, GasPrice, MilesPerGallon, ParkFees, TollsFees, TotGallons, TotGasExp, TotExpense;
    public void setValues(double tM, double gP, double mpg, double p, double t){
        TotMiles = tM;
        GasPrice = gP;
        MilesPerGallon = mpg;
        ParkFees = p;
        TollsFees = t;
    }
    public void CalcTotGallons(){
        TotGallons = getTotMiles()/getMilesPerGallon();
    }
    public void CalcGasExp(){
        TotGasExp = getTotGallons() * getGasPrice();
    }
    public void CalcTotExpense(){
        TotExpense = getTotGasExp() + getParkFees() + getTollsFees();
    }

    public double getTotMiles() {
        return TotMiles;
    }

    public double getGasPrice() {
        return GasPrice;
    }

    public double getParkFees() {
        return ParkFees;
    }

    public double getTollsFees() {
        return TollsFees;
    }

    public double getMilesPerGallon() {
        return MilesPerGallon;
    }

    public double getTotGallons() {
        return TotGallons;
    }

    public double getTotGasExp() {
        return TotGasExp;
    }

    public double getTotExpense() {
        return TotExpense;
    }

    public void setGasPrice(double gasPrice) {
        GasPrice = gasPrice;
    }

    public void setMilesPerGallon(double milesPerGallon) {
        MilesPerGallon = milesPerGallon;
    }

    public void setParkFees(double parkFees) {
        ParkFees = parkFees;
    }

    public void setTollsFees(double tollsFees) {
        TollsFees = tollsFees;
    }

    public void setTotGallons(double totGallons) {
        TotGallons = totGallons;
    }

    public void setTotGasExp(double totGasExp) {
        TotGasExp = totGasExp;
    }

    public void setTotExpense(double totExpense) {
        TotExpense = totExpense;
    }

    public void setTotMiles(double totMiles) {
        TotMiles = totMiles;
    }
}
