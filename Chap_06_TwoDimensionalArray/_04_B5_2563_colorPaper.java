package Chap_06_TwoDimensionalArray;

import java.util.Scanner;

public class _04_B5_2563_colorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean white[][] = new boolean[101][101];
        int count = 0;

        for (int i = 0; i < sc.nextInt(); i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (; x < x+10; x++) {
                for (; y < y+10; y++)
                    white[x][y] = true;
            }
        }

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (white[i][j])
                    count++;
            }
        }

        System.out.println(count);

    }
}
