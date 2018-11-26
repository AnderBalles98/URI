
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
            double A = Double.parseDouble(line[0]);
            double B = Double.parseDouble(line[1]);
            double C = Double.parseDouble(line[2]);
            System.out.format(Locale.ROOT, "TRIANGULO: %.3f\n", A*C/2.0);
            System.out.format(Locale.ROOT, "CIRCULO: %.3f\n", 3.14159*Math.pow(C, 2.0));
            System.out.format(Locale.ROOT, "TRAPEZIO: %.3f\n", C*(A+B)/2.0);
            System.out.format(Locale.ROOT, "QUADRADO: %.3f\n", Math.pow(B, 2.0));
            System.out.format(Locale.ROOT, "RETANGULO: %.3f\n", A*B);
        }
    }
}
