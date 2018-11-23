import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;


/**
 * @author ANDERSON BALLESTEROS
 */

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String line;
        TreeSet<String> list = new TreeSet<>();
        while (leer.ready()) {
            line = leer.readLine()+" ";
           
            String word="";
            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    word+=c;
                }else{
                    if (!word.isEmpty()) {
                        list.add(word.toLowerCase());
                    }
                    word="";
                }
            }
        }
        for (String element : list) {
            System.out.println(element);
        }
    }
}
