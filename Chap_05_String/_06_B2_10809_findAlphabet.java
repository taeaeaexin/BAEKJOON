package Chap_05_String;

import java.util.Scanner;

public class _06_B2_10809_findAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N[] = new int[26];

        for (int i = 0; i < N.length; i++)
            N[i] = -1;

        for (int i = 0; i < S.length(); i++) {
            int ASCII = S.charAt(i);
            ASCII -= 97;
            if (N[ASCII] == -1)
                N[ASCII] += i+1;
            }

        for (int i = 0; i < N.length; i++)
            System.out.print(N[i]+" ");


    }
}
