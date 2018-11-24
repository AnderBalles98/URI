
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(leer.readLine());
        String aux="";
        for (int i = 0; i < cases; i++) {
            String line[] = leer.readLine().split(" ");
            BigInteger a = new BigInteger(line[0]);
            aux =""+a.pow(Integer.parseInt(line[1]));
            System.out.println(aux.length());
        }
    }
}
