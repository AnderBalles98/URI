
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
            double A = Double.valueOf(leer.readLine());
            double B = Double.valueOf(leer.readLine());
            System.out.format(Locale.ROOT, "MEDIA = %.5f\n", ((A*3.5)+(B*7.5))/11.0);
        }
    }
}
