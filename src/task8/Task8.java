package task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            String current = bufferedReader.readLine();
            int count = 0;

            for (int j = 0; j < current.length() - 1; j++) {
                for (int k = j+1; k < current.length(); k++) {
                    if (current.charAt(j) == current.charAt(k)) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.println(current);
                return;
            }
        }
    }
}
