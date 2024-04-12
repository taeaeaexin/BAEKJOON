package Chap_12_Burtforth;

import java.util.Scanner;

public class _04_S4_1018_chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min_count = 99;
        int count = 0;
        char f = 'B';
        char arr[][] = new char[a][b];

        for (int i = 0; i < a; i++) {
            String s = sc.next();
            for (int j = 0; j < b; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        sc.close();

        for (int m = 0; m <= 1; m++) {
            if (m == 1) f = 'W';
            for (int i = 0; i <= a - 8; i++) {
                for (int j = 0; j <= b - 8; j++) {
                    count = 0;
                    for (int k = i; k < i + 8; k++) {
                        for (int l = j; l < j + 8; l++) {
                            if (k % 2 == 0 && l % 2 == 0 && arr[k][l] != f) {
                                count++;
                            } else if (k % 2 == 0 && l % 2 == 1 && arr[k][l] == f) {
                                count++;
                            } else if (k % 2 == 1 && l % 2 == 0 && arr[k][l] == f) {
                                count++;
                            } else if (k % 2 == 1 && l % 2 == 1 && arr[k][l] != f) {
                                count++;
                            }
                        }

                    }
                    if (count < min_count) min_count = count;
                }
            }
        }
        System.out.println(min_count);
    }
}