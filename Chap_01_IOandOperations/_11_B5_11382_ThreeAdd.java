package BAEKJOON;

import java.util.Scanner;

public class N11382_ThreeAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long num3 = sc.nextLong();

        sc.close();

        System.out.println(num1+num2+num3);
    }
}
