package Chap_SWEA;

import java.util.Scanner;

public class S1_14889 {
    public static int N;
    public static int[][] status = new int[20][20];
    public static int result = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                status[i][j] = sc.nextInt();
            }
        }

        dfs(0, 0);
    }

    public static void dfs(int depth,  int gap) {
        if(depth == N){
            result = Math.min(result, gap);
            return;
        }

    }
}
