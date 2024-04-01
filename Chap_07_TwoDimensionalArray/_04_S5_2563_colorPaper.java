package Chap_07_TwoDimensionalArray;

import java.util.Scanner;

public class _04_S5_2563_colorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        boolean arr[][] = new boolean[101][101];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    arr[j][k] = true;
                }
            }
        }

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (arr[i][j])
                    count++;
            }

        }

        System.out.println(count);

    }
}
