import java.io.IOException;

public class TestCode {
    public static void main(String[] args) {
        try{
            CSVCreator file = new CSVCreator("employee");
            file.HeaderReport();

            file.LineWriteReport("Gustavo Alatta", 40, 20.00);
            file.LineWriteReport("John Smith", 40, 15.00);
            file.LineWriteReport("Laurie Alfaro", 20, 20.00);

            file.CloseCSVFile();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
