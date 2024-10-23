package codingtest;

import java.util.Scanner;

public class Jenga_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int cnt[] = new int[T];

        // 테스트케이스 T
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int arr[][] = new int[N][3];

            // 젠가 세팅
            for (int j = 0; j < N; j++) {
                String line = sc.next();
                for (int k = 0; k < 3; k++) {
                    arr[j][k] = line.charAt(k) - '0';
                }
            }


            // 젠가 빼기
            do {
                int turn_cnt = 0;

                for (int j = 1; j < N; j++) {
                    if (arr[j][0] == 1 && arr[j][1] == 1 && arr[j][2] == 0) {
                        arr[j][0] = 0;
                        turn_cnt = 1;
                        break;
                    } else if (arr[j][0] == 0 && arr[j][1] == 1 && arr[j][2] == 1) {
                        arr[j][2] = 0;
                        turn_cnt = 1;
                        break;
                    }
                }

                for (int j = 1; j < N; j++) {
                    if (arr[j][0] == 1 && arr[j][1] == 1 && arr[j][2] == 1 && turn_cnt == 0) {
                        arr[j][1] = 0;
                        turn_cnt = 1;
                        break;
                    }
                }

                for (int j = 1; j < N; j++) {
                    if (arr[j][0] == 0 && arr[j][1] == 0 && arr[j][2] == 0 && turn_cnt == 0) {
                        turn_cnt = 0;
                        break;
                    }
                }

                if (turn_cnt == 1) {
                    cnt[i]++;
                } else {
                    break;
                }
            }
            while (true);
        }

        for (int i = 0; i < T; i++) {
            if (cnt[i] % 2 == 0) {
                System.out.println("Nono");
            } else {
                System.out.println("Yesyes");
            }

        }

    }
}