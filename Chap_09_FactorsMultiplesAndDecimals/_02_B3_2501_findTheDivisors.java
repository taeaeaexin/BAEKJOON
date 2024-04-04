package Chap_09_FactorsMultiplesAndDecimals;

import java.util.Scanner;

public class _02_B3_2501_findTheDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        sc.close();

        for (int i = 1; i < N + 1; i++) {
            if (N % i == 0) count++;
            if (count == K) {
                System.out.println(i);
                break;
            }
        }
        if (count < K) System.out.println(0);

    }
}
