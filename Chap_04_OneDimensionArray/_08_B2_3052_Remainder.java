package Chap_04_OneDimensionArray;

import java.util.Scanner;

public class _08_B2_3052_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean arr[] = new boolean[42];
        int count = 0;

        for (int i = 0; i < 10; i++)
            arr[sc.nextInt()%42] = true;

        for (int i = 0; i < 42; i++) {
            if (arr[i] == true)
                count++;
        }

        System.out.println(count);
    }
}