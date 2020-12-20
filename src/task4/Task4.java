package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        int sum = 0;
        int p = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            p = p * i;
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + p);

    }
}
