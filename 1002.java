
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
            double r = Double.parseDouble(leer.readLine());
            System.out.format(Locale.ROOT, "A=%.4f\n", 3.14159*Math.pow(r, 2.0));
        }
    }
}
