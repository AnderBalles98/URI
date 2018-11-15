import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {
    static String text;
    private static boolean isSub(String sub){
        int index =0;
        for (char c : text.toCharArray()) {
            if (c == sub.charAt(index)) {
                index++;
            }
            if (index==sub.length()) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Integer cases = Integer.parseInt(leer.readLine());
        for (int i = 0; i < cases; i++) {
            text = leer.readLine();
            Integer subs = Integer.parseInt(leer.readLine());
            for (int j = 0; j < subs; j++) {
                String sub = leer.readLine();
                if (isSub(sub)) {
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
