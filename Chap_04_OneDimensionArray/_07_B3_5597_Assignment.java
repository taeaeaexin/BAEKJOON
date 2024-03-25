package Chap_04_OneDimensionArray;

import java.util.Scanner;

public class _07_B3_5597_Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[31];

        for (int i = 1; i <= 28; i++) {
            int a = sc.nextInt();
            arr[a] = a;
        }
        sc.close();

        for (int i = 1; i <= 30; i++) {
            if (arr[i] != i)
                System.out.println(i);
        }

    }
}
