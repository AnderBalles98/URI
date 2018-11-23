import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;


/**
 * @author ANDERSON BALLESTEROS
 */

class Main {
    
    private static void addTime(int times[], int products, int checkers[]){
        int index = 0;
        int min = times[0];
        for (int i = 0; i < times.length; i++) {
            if (times[i]<min) {
                min = times[index=i];
            }
        }
        times[index] += checkers[index]*products;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String CC[] = leer.readLine().split(" ");
        int checker = Integer.parseInt(CC[0]);
        int client = Integer.parseInt(CC[1]);
        int checkers[] = new int[checker];
        int times[] = new int[checker];
        String c[] = leer.readLine().split(" ");
        String cl[] = leer.readLine().split(" ");
        for (int i = 0; i < c.length; i++) {
            checkers[i]=Integer.parseInt(c[i]);
            times[i] = 0;
        }
        for (String product : cl) {
            addTime(times, Integer.parseInt(product), checkers);
        }
        int max = 0;
        for (int time : times) {
            if (time>max) {
                max = time;
            }
        }
        System.out.println(max);
        
    }
}
