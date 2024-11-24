package Chap_SWEA;

import java.util.Scanner;

public class B2_13458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int C = sc.nextInt();

        long result = 0;

        for (int i = 0; i < N; i++) {
            arr[i] -= B;
            result++;
            if (arr[i] > 0) {
                result += (arr[i] + C - 1) / C;
            }
        }
        System.out.println(result);
    }
}
