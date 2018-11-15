import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = leer.readLine()).equals("0 0")) {
            String line[] = input.split(" ");
            Integer servers = Integer.parseInt(line[0]);
            Integer actions = Integer.parseInt(line[1]);
            ArrayList<Set<String>> serverList = new ArrayList<>();
            for (int i = 0; i < servers; i++) {
                String text[] = leer.readLine().split(" ");
                Set<String> set = new HashSet<>();
                for (int j = 1; j < text.length; j++) {
                    set.add(text[j]);
                }
                serverList.add(set);
            }
            Integer out = 0;
            for (int i = 0; i < actions; i++) {
                String text[] = leer.readLine().split(" ");
                for (int j = 0; j < serverList.size(); j++) {
                    for (int k = 1; k < text.length; k++) {
                        if (serverList.get(j).contains(text[k])) {
                            out++;
                            break;
                        }
                    }
                }
            }
            System.out.println(out);
        }
    }
}
