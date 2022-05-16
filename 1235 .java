import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        while (reader.ready()) {
            int times = Integer.parseInt(reader.readLine());
            for (int i = 0; i < times; i++) {
                String input = reader.readLine();
                char[] inputArray = input.toCharArray();
                int middle = input.length()/2;
                for (int j = middle -1; j > -1 ; j--) {
                    System.out.print(inputArray[j]);
                }
                for (int j = inputArray.length - 1; j >= middle ; j--) {
                    System.out.print(inputArray[j]);
                }
                System.out.println();
            }
        }

    }

}
