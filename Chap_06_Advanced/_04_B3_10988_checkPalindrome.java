package Chap_06_Advanced;

import java.util.Scanner;

public class _04_B3_10988_checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        sc.close();

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) == str.charAt(str.length()-1-i))
                count++;
        }
        if (str.length()/2 == count)
            System.out.println(1);
        else System.out.println(0);
    }
}
