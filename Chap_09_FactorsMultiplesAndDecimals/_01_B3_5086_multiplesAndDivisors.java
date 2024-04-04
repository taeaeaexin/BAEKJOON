package Chap_09_FactorsMultiplesAndDecimals;

import java.util.Scanner;

public class _01_B3_5086_multiplesAndDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == b && a == 0)
                break;
            else if (b % a == 0)
                System.out.println("factor");
            else if (a % b == 0)
                System.out.println("multiple");
            else System.out.println("neither");

        }
    }
}
