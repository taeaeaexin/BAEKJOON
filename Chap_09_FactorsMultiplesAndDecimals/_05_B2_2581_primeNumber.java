package Chap_09_FactorsMultiplesAndDecimals;

import java.util.Scanner;

public class _05_B2_2581_primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0, min = 10000;

        for (int i = M; i <= N; i++) {
            int f = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) f++;
            }
            if (f == 2) {
                sum += i;
                if (i < min) min = i;
            }
        }
        if (sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else System.out.println(-1);
    }
}
