package BAEKJOON;

import java.util.Scanner;

public class _5_B3_2884_Alarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int alarm = hour*60 + min - 45;
        sc.close();

        if (alarm >= 0)
            System.out.println(alarm/60 + " " + alarm%60);
        else System.out.println((1440+alarm)/60 + " " + (1440+alarm)%60);
    }
}
