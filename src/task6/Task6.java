package task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(bufferedReader.readLine());
        String minlength = null;
        String maxlength = null;
        for (int i = 0; i < n; i++) {
            String current = bufferedReader.readLine();

            if (minlength == null || minlength.length() > current.length()) {
                minlength = current;
            }
            if (maxlength == null || maxlength.length() < current.length()) {
                maxlength = current;
            }
        }
        System.out.println(maxlength + " " + maxlength.length());
        System.out.println(minlength + " " + minlength.length());

    }
}
