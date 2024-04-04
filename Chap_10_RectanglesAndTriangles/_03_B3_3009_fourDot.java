package Chap_10_RectanglesAndTriangles;

import java.util.Scanner;

public class _03_B3_3009_fourDot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[] = {sc.nextInt(), sc.nextInt()};
        int arr2[] = {sc.nextInt(), sc.nextInt()};
        int arr3[] = {sc.nextInt(), sc.nextInt()};
        int x = 0, y = 0;

        if (arr1[0] == arr2[0]) x = arr3[0];
        else if (arr1[0] == arr3[0]) x = arr2[0];
        else x = arr1[0];

        if (arr1[1] == arr2[1]) y = arr3[1];
        else if (arr1[1] == arr3[1]) y = arr2[1];
        else y = arr1[1];

        System.out.println(x + " " + y);
    }
}
