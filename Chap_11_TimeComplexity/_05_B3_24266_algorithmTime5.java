package Chap_11_TimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05_B3_24266_algorithmTime5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(bf.readLine());
        int count = 0;
        bf.close();

        System.out.println(n * n * n);
        System.out.println(3);
    }
}
