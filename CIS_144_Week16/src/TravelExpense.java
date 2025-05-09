public class TravelExpense {
    public double MilesToDrive, GasPrice, MilesPerGallon, TotGasExpense,TotTravelExp;

    public TravelExpense (double mtd, double gp, double mpg){
        this.MilesToDrive = mtd;
        this.GasPrice = gp;
        this.MilesPerGallon = mpg;
    }
    public void CalcGasExp(){
        this.TotGasExpense = (MilesToDrive/MilesPerGallon);
    }
    public void CalcTotalExp(){
        this.TotTravelExp = this.TotGasExpense * this.GasPrice;
    }

    public double getTotGasExpense() {
        return TotGasExpense;
    }

    public double getTotTravelExp() {
        return TotTravelExp;
    }
}
