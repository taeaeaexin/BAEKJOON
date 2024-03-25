package BAEKJOON;

import java.util.Scanner;

public class N10950_ForPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 1 ; i <= T ; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1+num2);
        }
        sc.close();
    }
}
