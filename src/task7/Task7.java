package task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] array = new String[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String current = bufferedReader.readLine();
            array[i] = current;
            sum += current.length();
        }
        int avg = sum / n;

        for (String element : array) {
            if (element.length() < avg) {
                System.out.println("Less" + element + " " + element.length());
            } else if (element.length() > avg){
                System.out.println("Greater" + element + " " + element.length());
            }

        }


    }
    
}
