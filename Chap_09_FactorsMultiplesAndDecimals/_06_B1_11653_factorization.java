package Chap_09_FactorsMultiplesAndDecimals;

import java.util.Scanner;

public class _06_B1_11653_factorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        while (N != 1) {
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    System.out.println(i);
                    N /= i;
                    break;
                }
            }
        }
    }
}
