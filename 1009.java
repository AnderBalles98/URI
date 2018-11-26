
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
            leer.readLine();
            double salary = Double.valueOf(leer.readLine());
            salary+=Double.valueOf(leer.readLine())*0.15;
            System.out.format(Locale.ROOT, "TOTAL = R$ %.2f\n", salary);
        }
    }
}
