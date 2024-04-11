package Chap_10_RectanglesAndTriangles;

import java.util.Scanner;

public class _07_B3_5073_triangleAndThreeSides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max = a;
            max = Math.max(max, b);
            max = Math.max(max, c);

            if (a == 0 && b == 0 && c == 0) break;
            else if (max < a + b + c - max) {
                if (a == b && b == c) System.out.println("Equilateral");
                else if (a == b || a == c || b == c) System.out.println("Isosceles");
                else System.out.println("Scalene");
            } else System.out.println("Invalid");

        }

    }
}
