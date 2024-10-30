package codingtest;

import java.util.Scanner;

public class SSAFY {
    public static int func(int N, int K) {
        int cnt = 0;

        for (int i = N-1; i >= 1 ; i--) {
            for (int j = i-1; j >= 0 ; j--) {
                cnt++;
                if(cnt == K){
                    return i+1;
                }
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(func(N,K));
    }
}
