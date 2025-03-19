public class DateClass {
    private int month;
    private int day;
    private int year;
    private String MonthName(){
        if (month == 1){
            return "You Entered January " + this.day + ", " + this.year;
        }
        else if(month == 2){
            return "You Entered February " + this.day + ", " + this.year;
        }
        else if (month == 3){
            return "You Entered March " + this.day + ", " + this.year;
        }
        else if(month == 4){
            return "You Entered April " + this.day + ", " + this.year;
        }
        else if(month == 5){
            return "You Entered May " + this.day + ", " + this.year;
        }
        else if(month == 6){
            return "You Entered June " + this.day + ", " + this.year;
        }
        else if(month == 7){
            return "You Entered July " + this.day + ", " + this.year;
        }
        else if(month == 8){
            return "You Entered August " + this.day + ", " + this.year;
        }
        else if(month == 9){
            return "You Entered September " + this.day + ", " + this.year;
        }
        else if(month == 10){
            return "You Entered October " + this.day + ", " + this.year;
        }
        else if(month == 11){
            return "You Entered November " + this.day + ", " + this.year;
        }
        else if (month == 12){
            return "You Entered December " + this.day + ", " + this.year;
        }
        else{
            return "You have entered an invalid month!";
        }

    }
    public DateClass(int m, int d, int y){
        this.month = m;
        this.day = d;
        this.year = y;
    }
    public void PrintMonth(){
        System.out.println(MonthName());
    }
}