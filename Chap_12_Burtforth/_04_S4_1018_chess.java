package Chap_12_Burtforth;

import java.util.Scanner;

public class _04_S4_1018_chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char arr[][] = new char[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }
        sc.close();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(arr[i][j]);
            }

        }

    }
}