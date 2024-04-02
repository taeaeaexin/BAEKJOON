package Chap_08_GeneralMath;

import java.util.Scanner;

public class _01_B2_2745_baseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int B = sc.nextInt();
        int sum = 0;
        int num = 0;

        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            if ('0' <= c && c <= '9')
                num = c - 48;
            else num = c - 55;

            sum += (num) * Math.pow(B,N.length()-1-i);
        }

        System.out.println(sum);
    }
}
