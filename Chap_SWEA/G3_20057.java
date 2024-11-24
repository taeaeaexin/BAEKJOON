package Chap_SWEA;
import java.util.Scanner;

public class G3_20057 {
    static int N, Result = 0;
    static int[][] map;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    static int[][] sandX = {
            {1, -1, 2, -2, 0, 1, -1, 1, -1, 0}, // 좌
            {-1, -1, 0, 0, 2, 0, 0, 1, 1, 1}, // 하
            {1, -1, 2, -2, 0, 1, -1, 1, -1, 0},  // 우
            {1, 1, 0, 0, -2, 0, 0, -1, -1, -1}   // 상
    };
    static int[][] sandY = {
            {1, 1, 0, 0, -2, 0, 0, -1, -1, -1}, // 좌
            {-1, 1, -2, 2, 0, -1, 1, -1, 1, 0},  // 하
            {-1, -1, 0, 0, 2, 0, 0, 1, 1, 1},   // 우
            {1, -1, 2, -2, 0, 1, -1, 1, -1, 0}   // 상
    };
    static int[] sandRate = {1, 1, 2, 2, 5, 7, 7, 10, 10, 0}; // 각 비율

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        // 시작 위치는 중앙
        int x = N / 2, y = N / 2;
        int move = 1; // 현재 이동 거리

        // 토네이도 이동
        while (true) {
            for (int dir = 0; dir < 4; dir++) {
                for (int i = 0; i < move; i++) {
                    x += dx[dir];
                    y += dy[dir];

                    // 모래 이동
                    moveSand(x, y, dir);

                    // 종료 조건: (0, 0)에 도달하면 종료
                    if (x == 0 && y == 0) {
                        System.out.println(Result);
                        return;
                    }
                }
                // 방향 두 번마다 이동 거리 증가
                if (dir == 1 || dir == 3) move++;
            }
        }
    }

    // 모래 이동 처리
    private static void moveSand(int x, int y, int dir) {
        int totalSand = map[x][y];
        int spreadSand = 0;
        map[x][y] = 0; // 현재 위치의 모래는 0으로 초기화

        for (int i = 0; i < 10; i++) {
            int nx = x + sandX[dir][i];
            int ny = y + sandY[dir][i];
            int sand;

            // 비율에 따라 모래 계산 (소숫점 버림)
            if (i == 9) {
                sand = totalSand - spreadSand; // 알파 처리
            } else {
                sand = (int) Math.floor((totalSand * sandRate[i]) / 100.0); // 소수점 버림
            }

            // 범위를 벗어나면 Result에 추가
            if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
                Result += sand;
            } else {
                map[nx][ny] += sand;
            }

            if (i != 9) spreadSand += sand; // 알파 계산 제외
        }
    }
}
