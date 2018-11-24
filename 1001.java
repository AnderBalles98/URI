import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(leer.readLine());
        int b = Integer.parseInt(leer.readLine());
        System.out.println("X = "+(a+b));
    }
}
