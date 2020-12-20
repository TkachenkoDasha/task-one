package task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        switch (n) {
            case 1: {
                System.out.println("Jan");
                break;
            }
            case 2: {
                System.out.println("Feb");
                break;
            }
            case 6: {
                System.out.println("Jun");
                break;
            }
            default: {
                System.out.println("-");
            }

        }
    }
}
