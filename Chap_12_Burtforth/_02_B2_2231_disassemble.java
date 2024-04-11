package Chap_12_Burtforth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_B2_2231_disassemble {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = 0;
        bf.close();

        for (int i = 1; i < N; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum + i == N) {
                M = i;
                break;
            }

        }
        System.out.println(M);
    }
}
