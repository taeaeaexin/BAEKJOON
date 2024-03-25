package BAEKJOON;

import java.util.Scanner;

public class _10_B3_2588_ThreeDigitsMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A * (B%10));
        System.out.println(A * (B%100/10));
        System.out.println(A * (B%1000/100));
        System.out.println(A*B);

    }
}
