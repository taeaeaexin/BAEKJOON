package Chap_11_TimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _03_B3_24264_algorithmTime3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bf.readLine());
        bf.close();

        System.out.println(n*n);
        System.out.println(2);
    }
}
