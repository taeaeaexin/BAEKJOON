package Chap_05_String;

import java.util.Scanner;

public class _09_B2_2908_constant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int reverseA = (A/100)+(A%100 - A%10)+((A%10)*100);
        int reverseB = (B/100)+(B%100 - B%10)+((B%10)*100);

        if (reverseA > reverseB)
            System.out.println(reverseA);
        else System.out.println(reverseB);

    }
}
