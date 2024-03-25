package Chap_04_OneDimensionArray;

import java.util.Scanner;

public class _09_B2_10811_FliptheBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        int M = sc.nextInt();
        int T = 0;

        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            for (; y >= x; x++, y--) {
                T = arr[y];
                arr[y] = arr[x];
                arr[x] = T;
            }
        }

        sc.close();


        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}

