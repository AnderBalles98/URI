import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Integer> life = new TreeMap<>();
        Set<String> dead = new LinkedHashSet<>();
        while (leer.ready()) {
            String text[] = leer.readLine().split(" ");
            if (!life.containsKey(text[0])) {
                life.put(text[0], 0);
            }
            life.put(text[0], life.get(text[0]) + 1);
            dead.add(text[1]);

        }
        dead.forEach(life::remove);
        System.out.println("HALL OF MURDERERS");
        life.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}
