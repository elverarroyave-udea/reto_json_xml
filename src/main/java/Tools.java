import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tools {
    public static String BufferReaderToString(String filePath){
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = null;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append("\n").append(line);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error encontrado la ruta del archivo xml!!!!");
        } catch (IOException io) {
            System.out.println("Error!!!!");
        }

        return stringBuilder.toString();
    }
}
