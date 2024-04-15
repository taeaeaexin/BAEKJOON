package Chap_12_Burtforth;

import java.util.Scanner;

public class _06_S4_2839_sugar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 5001;

        for (int i = 0; i <= N / 3; i++) {
            for (int j = 0; j <= N / 3; j++) {
                if (N == i * 5 + j * 3 && i + j < count) {
                    count = i + j;
                }
            }
        }
        if (count == 5001) System.out.println(-1);
        else System.out.println(count);
    }


}
