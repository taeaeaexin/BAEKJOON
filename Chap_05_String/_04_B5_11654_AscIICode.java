package Chap_05_String;

import java.util.Scanner;

public class _04_B5_11654_AscIICode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        sc.close();
        System.out.println((int)str.charAt(0));
    }
}
