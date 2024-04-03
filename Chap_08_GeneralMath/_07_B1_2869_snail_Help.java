package Chap_08_GeneralMath;

import java.util.Scanner;

public class _07_B1_2869_snail_Help {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong(), B = sc.nextLong(), V = sc.nextLong();

        // 하루에 올라갈 수 있는 높이를 (A - B)로 계산합니다.
        // 목표 높이 V에서 마지막 날은 미끄러지지 않으므로, (V - B)로 나눈 후 올림 처리합니다.
        // 올림 처리를 위해 Math.ceil() 메서드를 사용합니다.
        long day = (long) Math.ceil((double) (V - B) / (A - B));

        System.out.println(day);
    }
}