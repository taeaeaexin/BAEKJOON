package Chap_SWEA;

import java.util.Scanner;

public class S3_2606 {
    static int[][] map;
    static boolean[] visit;
    static int computer, connect;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        computer = sc.nextInt();
        connect = sc.nextInt();
        map = new int[computer+1][computer+1];
        visit = new boolean[computer+1];

        for (int i = 0; i < connect ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            map[x][y] = map[y][x] = 1;
        }

        dfs(1);
        System.out.println(count);
    }

    public static void dfs(int depth) {
        visit[depth] = true;
        for (int i = 1; i <= computer ; i++) {
            if(map[depth][i] == 1 && !visit[i]) {
                count++;
                dfs(i);
            }
        }
        return;
    }
}