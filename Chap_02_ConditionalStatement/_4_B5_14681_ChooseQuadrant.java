package BAEKJOON;

import java.util.Scanner;

public class _4_B5_14681_ChooseQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        if(x>0 && y>0)
            System.out.println(1);
        else if (x>0 && y<0)
            System.out.println(4);
        else if (x<0 && y>0)
            System.out.println(2);
        else if (x<0 && y<0)
            System.out.println(3);
    }
}
