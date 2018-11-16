import java.util.Scanner;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int h1 = leer.nextInt();
        int m1 = leer.nextInt();
        int h2 = leer.nextInt();
        int m2 = leer.nextInt();
        while (h1 != 0 || h2 != 0 || m1 != 0 || m2 != 0) {
            Integer begin = (h1 * 60) + m1;
            Integer end = (h2 * 60) + m2;
            if (end < begin) {
                System.out.println((1440 - Math.abs(begin - end)));
            } else if (end == begin) {
                System.out.println("1440");
            } else {
                System.out.println((end - begin));
            }
            h1 = leer.nextInt();
            m1 = leer.nextInt();
            h2 = leer.nextInt();
            m2 = leer.nextInt();
        } 
    }
}
