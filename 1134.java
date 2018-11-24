
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int gas[] = {0, 0, 0};
        int in;
        while ((in = Integer.parseInt(leer.readLine())) != 4) {
            if (in >= 1 && in <= 3) {
                gas[in - 1]++;
            }
        }
        System.out.println("MUITO OBRIGADO\nAlcool: " + gas[0] + "\nGasolina: " + gas[1] + "\nDiesel: "
                + gas[2]);
    }
}
