package Chap_05_String;

import java.util.Scanner;

public class _05_B4_11720_sumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String A = sc.next();
        int sum = 0;

        for (int i = 0; i < N; i++)
            sum += Character.getNumericValue(A.charAt(i));
        System.out.println(sum);
    }
}
