import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        while (leer.ready()) {
            int cases = Integer.parseInt(leer.readLine());
            double min = 12.0;
            for (int i = 0; i < cases; i++) {
                double now =Double.parseDouble(leer.readLine());
                if (now < min) {
                    min = now;
                }
            }
            System.out.println(min);
        }
    }
}
