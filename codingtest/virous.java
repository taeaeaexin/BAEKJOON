//package codingtest;
//import java.util.Scanner;
//
//public class virous {
//    public static void func2(int x, int y){
//
//    }
//
//    public static void func(int arr[][][], int N, int K){
//        int arr2[][] = new int[N][N];
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                if(arr[i][j][0] != 0){
//                    if(arr[i][j][1] == 1){
//                        arr2[i-1][j]++;
//                    }else if(arr[i][j][1] == 2){
//                        arr2[i+1][j]++;
//                    }else if(arr[i][j][1] == 3){
//                        arr2[i][j-1]++;
//                    }else if(arr[i][j][1] == 4){
//                        arr2[i][j+1]++;
//                    }
//                }
//            }
//        }
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                if(arr2[i][j] == 1 && (i == 0 || i == N-1 || j == 0 || j == N-1)){
//                    func2(i, j);
//                }else if(arr2[i][j] >= 2){
//                    func3();
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//
//        for (int test_case = 1; test_case < T; test_case++) {
//            int N, M, K; // 길이, 시간, 군집
//            N = sc.nextInt();
//            M = sc.nextInt();
//            K = sc.nextInt();
//            int arr[][][] = new int[N][N][2];
//
//            for (int i = 0; i < K; i++) {
//                int x, y, m, a; // x,y,수,방향
//                x = sc.nextInt();
//                y = sc.nextInt();
//                m = sc.nextInt();
//                a = sc.nextInt();
//
//                arr[x][y][0] = m; // 수
//                arr[x][y][1] = a; // 방향
//            }
//
//            for (int i = 1; i <= M; i++) {
//                func(arr, N, K);
//            }
//        }
//    }
//}
