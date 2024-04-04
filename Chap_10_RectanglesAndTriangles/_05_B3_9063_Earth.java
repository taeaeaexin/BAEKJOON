package Chap_10_RectanglesAndTriangles;

import java.util.Scanner;

public class _05_B3_9063_Earth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxXY[] = {-100000, -100000};
        int minXY[] = {100000, 100000};

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > maxXY[0]) maxXY[0] = x;
            if (y > maxXY[1]) maxXY[1] = y;
            if (x < minXY[0]) minXY[0] = x;
            if (y < minXY[1]) minXY[1] = y;
        }
        sc.close();
        System.out.println((maxXY[0] - minXY[0]) * (maxXY[1] - minXY[1]));

    }
}
