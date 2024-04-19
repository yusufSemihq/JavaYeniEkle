import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        int totla = 0;

        try {

            reader = new BufferedReader(new FileReader("C:\\Users\\Windows 10\\Desktop\\JAVA\\readingFileDemo\\src\\sayilar.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                    totla = Integer.valueOf(line);
            }
        } finally {

        }
        try {
            reader.close();
        } catch (Exception exception) {

        }

    }
}