import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int students = Integer.parseInt(leer.readLine());
        double mayor = 8.0;
        String name = "Minimum note not reached";
        String[] student;
        for (int i = 0; i < students; i++) {
            student = leer.readLine().split(" ");
            if (Double.parseDouble(student[1])>= mayor) {
                mayor = Double.parseDouble(student[1]);
                name = student[0];
            }
        }
        System.out.println(name);
    }
}
