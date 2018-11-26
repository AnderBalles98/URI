
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
            int A = Integer.valueOf(leer.readLine());
            int B = Integer.valueOf(leer.readLine());
            System.out.println("PROD = "+(A*B));
        }
    }
}
