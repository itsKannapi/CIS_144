import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVCreator {
    private FileWriter file;
    static Scanner sc = new Scanner(System.in);


    public CSVCreator(String n) throws IOException {
        file = new FileWriter(n + ".csv", true);
    }
    public void HeaderReport() throws IOException {
        file.write("EmployeeName, hours, PayRate, Payment\n");
    }
    public void LineWriteReport(String name, int hours, double payRate) throws IOException {
        double payment = hours * payRate;
        String line = String.format("%s, %d, %.2f, %.2f%n", name, hours, payRate, payment);
        file.write(line);
    }
    public void CloseCSVFile() throws IOException {
        file.close();
    }
}
