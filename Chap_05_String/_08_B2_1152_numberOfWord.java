package Chap_05_String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _08_B2_1152_numberOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        sc.close();

        StringTokenizer str2 = new StringTokenizer(str," ");

        System.out.println(str2.countTokens());

    }
}
