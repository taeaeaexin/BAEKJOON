package Chap_SWEA;

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
        System.out.println(result);
    }

    public static void DFS(int index, int money){
        if(index >= N){
            result = Math.max(money, result);
            return;
        }
        if(index + schedule[index][0] <= N){
            DFS(index + schedule[index][0], money + schedule[index][1]);
        }else{
            DFS(index + schedule[index][0], money);
        }

        DFS(index + 1, money);
    }
}