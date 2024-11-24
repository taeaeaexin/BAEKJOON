package Chap_SWEA;

import java.util.Scanner;

public class S1_14888 {
    public static int N;
    public static int[] numbers;
    public static int[] operator;
    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        numbers = new int[N];
        operator = new int[4];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            operator[i] = sc.nextInt();
        }

        dfs(1, numbers[0]);
        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void dfs(int depth, int result) {
        if (depth == N) {
            MAX = Math.max(MAX, result);
            MIN = Math.min(MIN, result);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;

                switch (i){
                    case 0: dfs(depth+1,result+numbers[depth]); break;
                    case 1: dfs(depth+1,result-numbers[depth]); break;
                    case 2: dfs(depth+1,result*numbers[depth]); break;
                    case 3: dfs(depth+1,result/numbers[depth]); break;
                }

                operator[i]++;
            }

        }

    }
}