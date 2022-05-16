import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        int times = Integer.parseInt(reader.readLine());

        for (int i = 0; i < times; i++) {
            String input = reader.readLine();
            int output = 0, open = 0;
            char[] inputArray = input.toCharArray();
            for (int j = 0; j < inputArray.length; j++) {
                char character = inputArray[j];
                if (character == '<') {
                    open++;
                } else if (character == '>' && open > 0) {
                    open--;
                    output++;
                }
            }
            System.out.println(output);
        }

    }


}

