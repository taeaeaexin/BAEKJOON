package Chap_07_TwoDimensionalArray;

import java.util.Scanner;

public class _02_B3_2566_maximumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[9][9];
        int max = 0;
        int a = 1, b = 1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    a = i + 1;
                    b = j + 1;
                }

            }

        }
        System.out.println(max);
        System.out.println(a + " " + b);
    }
}
