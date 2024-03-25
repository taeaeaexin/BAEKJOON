package BAEKJOON;

import java.util.Scanner;

public class N2525_OvenTimer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int timer = sc.nextInt();
        int time = hour * 60 + min;

        if (time + timer < 1440)
            System.out.println((time+timer)/60+" "+(time+timer)%60);
        else
            System.out.println((time+timer-1440)/60+" "+(time+timer-1440)%60);
    }
}
