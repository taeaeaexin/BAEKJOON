package BAEKJOON;

import java.util.Scanner;

public class N1330_CompareNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();
        if (num1 > num2){
            System.out.println(">");
        } else if (num1 < num2) {
            System.out.println("<");
        } else if (num1 == num2){
            System.out.println("==");
        }

    }
}
