package Chap_10_RectanglesAndTriangles;

import java.util.Scanner;

public class _08_B3_14215_threeBar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        max = Math.max(max, b);
        max = Math.max(max, c);
        int sum = a + b + c - max;

        if ((a + b + c - max) <= max) max = a + b + c - max - 1;

        System.out.println(sum + max);
    }
}