package Chap_06_Advanced;

import java.util.Scanner;

public class _03_B3_printStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = 0; i < N; i++) {
            for (int j = N-1; j-i > 0; j--)
                System.out.print(" ");

            for (int j = 0; j < (i*2)+1; j++)
                System.out.print("*");

            System.out.println();
        }

        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < i+1; j++)
                System.out.print(" ");

            for (int j = 0; j < 2*(N-1-i)-1 ; j++)
                System.out.print("*");

            System.out.println();
        }


    }
}
