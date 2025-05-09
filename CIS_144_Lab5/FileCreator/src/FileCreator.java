import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    private FileWriter writer;

    public FileCreator(String fileName) throws IOException {
        writer = new FileWriter(fileName, true);
        writer.write("Store, January, February, March, April, Total\n");
    }

    public void WriteFile(String store, double jan, double feb, double mar, double apr) throws IOException {
        double total = jan + feb + mar + apr;
        writer.write(store + "," + jan + "," + feb + "," + mar + "," + apr + "," + total + "\n");
    }

    public void CloseFile() throws IOException {
        writer.close();
    }
}
