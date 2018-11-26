
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
            double C = Double.valueOf(leer.readLine());
            System.out.format(Locale.ROOT, "MEDIA = %.1f\n", ((A*2.0)+(B*3.0)+(C*5.0))/10.0);
        }
    }
}
