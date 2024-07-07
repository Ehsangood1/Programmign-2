import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) {
        // Path to the file
        String filePath = "output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, File!");
            writer.newLine();
            writer.write("This is a test file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
