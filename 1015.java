
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
            String line1[] = leer.readLine().split(" ");
            String line2[] = leer.readLine().split(" ");
            double x1 = Double.parseDouble(line1[0]);
            double y1 = Double.parseDouble(line1[1]);
            double x2 = Double.parseDouble(line2[0]);
            double y2 = Double.parseDouble(line2[1]);
            System.out.format(Locale.ROOT, "%.4f\n", Math.sqrt(Math.pow(x1-x2, 2.0)+
                    Math.pow(y2-y1, 2.0)));
        }
    }
}
