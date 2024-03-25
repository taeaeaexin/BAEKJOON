package BAEKJOON;

import java.util.Scanner;

public class _1_B5_2739_Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for (int i = 1 ; i < 10 ; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
