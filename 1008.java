
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
            String number = leer.readLine();
            double hours = Double.valueOf(leer.readLine());
            double price = Double.valueOf(leer.readLine());
            System.out.println("NUMBER = "+number);
            System.out.format(Locale.ROOT, "SALARY = U$ %.2f\n", hours*price);
        }
    }
}
