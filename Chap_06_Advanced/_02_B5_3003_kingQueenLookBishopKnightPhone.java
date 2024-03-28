package Chap_06_Advanced;

import java.util.Scanner;

public class _02_B5_3003_kingQueenLookBishopKnightPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[]{1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++)
            A[i] -= sc.nextInt();

        for (int i = 0; i < 6; i++)
            System.out.print(A[i]+" ");

    }
}