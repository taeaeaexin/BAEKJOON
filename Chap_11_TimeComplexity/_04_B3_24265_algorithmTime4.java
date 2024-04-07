package Chap_11_TimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04_B3_24265_algorithmTime4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(bf.readLine());
        int count = 0;
        bf.close();

        System.out.println(n * (n - 1) / 2);
        System.out.println(2);

    }
}
