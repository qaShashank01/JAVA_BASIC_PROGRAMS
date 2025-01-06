import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filewritten {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        writer.write("Hello, world!");
        writer.close();

        FileReader reader = new FileReader("output.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }

}
