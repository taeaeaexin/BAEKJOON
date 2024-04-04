package Chap_08_GeneralMath;

import java.util.Scanner;

public class _05_B2_2292_honeycomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int count = 0;

        while (N > 0) {
            if (count == 0) {
                N--;
                count++;
            } else {
                N -= count * 6;
                count++;
            }
        }
        System.out.println(count);
    }
}
