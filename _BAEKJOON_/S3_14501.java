package _BAEKJOON_;

import java.util.Scanner;

public class S3_14501 {
    static int N;
    static int[][] schedule;
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        schedule = new int[N][2];
        for (int i = 0; i < N; i++) {
            schedule[i][0] = sc.nextInt();
            schedule[i][1] = sc.nextInt();
        }
        result = 0;
        DFS(0, 0);
    }

    public static void DFS(int depth, int count){
        if(count >= N){
            result = Math.max(depth, result);
            return;
        }

    }
}