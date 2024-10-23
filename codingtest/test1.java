package codingtest;
import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X,N,S,sum,flag;
        X = sc.nextInt();
        N = sc.nextInt();
        int arr[][] = new int[X+1][2];
        sum = 0;
        flag = 0;

        for (int i = 0; i < N; i++){
            int a = sc.nextInt();
            arr[a-1][1] = 1;
        }
        S = sc.nextInt();

        while(flag != N) {
            int min = 99;
            int x = 0;
            arr[S-1][0] = 1;
            for (int i = 1; i <= X; i++) {
                if (arr[i - 1][1] == 1 && arr[i - 1][0] == 0 && S != i && Math.abs(S - i) < min) {
                    min = Math.abs(S - i);
                    x = i;
                }
            }
            sum += min;
            flag++;
            S = x;
            arr[x-1][0] = 1;
        }

        System.out.println(sum);

    }

}
