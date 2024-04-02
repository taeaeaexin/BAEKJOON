package Chap_08_GeneralMath;

import java.util.Scanner;

public class _02_B1_11005_baseConversion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();
        int tmp = 0;
        String result = "";

        while (N > 0) {
            tmp = N % B;
            if (0 <= tmp && tmp <= 9)
                result += tmp;
            else {
                char c = (char) (tmp + 55);
                result += c;
            }
            N /= B;
        }

        for (int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }

        sc.close();
    }
}
