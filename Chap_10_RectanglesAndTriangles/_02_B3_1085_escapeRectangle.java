package Chap_10_RectanglesAndTriangles;

import java.util.Scanner;

public class _02_B3_1085_escapeRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int min = 1000;

        if (x < min) min = x;
        if (w - x < min) min = w - x;
        if (y < min) min = y;
        if (h - y < min) min = h - y;

        System.out.println(min);

    }
}
