package BAEKJOON;

import java.util.Scanner;

public class N2525_ThreeDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();
        int max = dice1;
        sc.close();

        if (max < dice2)
            max = dice2;
        if (max < dice3)
            max = dice3;

        if (dice1 == dice2 && dice2 == dice3)
            System.out.println(10_000+dice1*1_000);
        else if (dice1 == dice2)
            System.out.println(1_000+dice1*100);
        else if (dice1 == dice3)
            System.out.println(1_000+dice1*100);
        else if (dice2 == dice3)
            System.out.println(1_000+dice2*100);
        else
            System.out.println(max*100);
    }
}
