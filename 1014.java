
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
            double km = Double.parseDouble(leer.readLine());
            double consumo = Double.parseDouble(leer.readLine());
            System.out.format(Locale.ROOT, "%.3f km/l\n", km/consumo);
        }
    }
}
