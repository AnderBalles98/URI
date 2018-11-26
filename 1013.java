
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * @author ANDERSON BALLESTEROS
 */
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        while (leer.ready()) {
            String line[] = leer.readLine().split(" ");
            System.out.println(Integer.max(Integer.max(Integer.parseInt(line[0]), 
                    Integer.parseInt(line[2])), Integer.parseInt(line[1]))+" eh o maior");
        }
    }
}
