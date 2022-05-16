package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        int time = Integer.parseInt(reader.readLine());

        System.out.println(time*2 + " minutos");

    }


}

