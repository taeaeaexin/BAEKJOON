package Chap_08_GeneralMath;

import java.util.Scanner;

public class _06_S5_1193_findTheFountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        int count = 0, sum = 0;
        String answer = "";
        sc.close();

        while (sum < X) {
            count++;
            sum += count;
        }

        for (int i = 0; i <= sum-X; i++) {
            int x = count-i;
            int y = i+1;
            if (count % 2 == 0)
                answer = x+"/"+y;
            else answer = y+"/"+x;
        }

        System.out.println(answer);
    }

}
