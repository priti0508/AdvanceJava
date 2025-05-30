
// File Writing and Reading Example
import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("This is a sample file.");
            writer.close();

            FileReader reader = new FileReader("sample.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
