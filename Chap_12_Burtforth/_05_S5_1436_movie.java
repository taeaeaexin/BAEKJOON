package Chap_12_Burtforth;

import java.util.Scanner;

public class _05_S5_1436_movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0, num = 665;
        sc.close();

        while (count != N) {
            num++;
            String str_num = String.valueOf(num);
            for (int i = 0; i <= str_num.length() - 3; i++) {
                if (str_num.charAt(i) == '6' && str_num.charAt(i + 1) == '6' && str_num.charAt(i + 2) == '6') {
                    count++;
                    break;
                }
            }
        }
        System.out.println(num);
    }

}
