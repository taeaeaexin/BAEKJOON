package Chap_08_GeneralMath;

import java.util.Scanner;

public class _04_B3_2903_centerMovementAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();
        int square = 1;
        int dot = 4;

        for (int i = 0; i < N; i++) {
            square *= 2;
            dot = (square + 1) * (square + 1);
        }

        System.out.println(dot);
    }
}
