import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInputExample {
    public static void main(String[] args) {
        // Path to the file
        String filePath = "input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
