
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
            double total = 0.0;
            for (int i = 0; i < 2; i++) {
                String line[] = leer.readLine().split(" ");
                double cant = Double.valueOf(line[1]);
                double price = Double.valueOf(line[2]);
                total+= cant*price;
            }
            System.out.format(Locale.ROOT, "VALOR A PAGAR: R$ %.2f\n", total);
        }
    }
}
