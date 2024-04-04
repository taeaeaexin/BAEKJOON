package Chap_09_FactorsMultiplesAndDecimals;

import java.util.Scanner;

public class _04_B2_1978_findPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            int c = 0;

            for (int j = 1; j <= n; j++) {
                if (n == 1) break;
                if (n % j == 0) c++;
            }
            if (c == 2) count++;
        }
        sc.close();
        System.out.println(count);
    }
}
