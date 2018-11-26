
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
            double r = Double.valueOf(leer.readLine());
            System.out.format(Locale.ROOT, "VOLUME = %.3f\n", (4.0/3.0)*3.14159*Math.pow(r, 3.0));
        }
    }
}
