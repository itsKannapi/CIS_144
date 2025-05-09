import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class FileManSamples2{
    static FileReader myFile = null;
    static BufferedReader br;
    static Scanner sc;
    static String row = null;

    public static void main(String[] args) {
        try {
            myFile = new FileReader("CIS_144_Week11/FileManipulation/employee.csv");
            br = new BufferedReader(myFile);
            while((row = br.readLine()) != null){
                //System.out.println(row);
                sc = new Scanner(row);
                sc.useDelimiter(",");
                while(sc.hasNext()){
                    String column = sc.next();
                    System.out.print(column + "\t");
                }
                System.out.println();
            }
            myFile.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}