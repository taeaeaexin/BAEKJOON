package Chap_09_FactorsMultiplesAndDecimals;

import java.util.Scanner;

public class _03_B1_9506_sumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == -1) break;
            int sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0)
                    sum += i;
            }

            if (n == sum) {
                System.out.print(n + " = " + 1);
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) System.out.print(" + " + i);
                }
                System.out.println();
            } else System.out.println(n + " is NOT perfect.");
        }
    }
}
