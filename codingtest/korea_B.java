package codingtest;

import java.util.Scanner;

public class korea_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = N * (N+1);
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = N+1;
        }

        while(true){
            if (N % 2 == 0){
                for (int i = 0; i < (N/2)-1; i++) {
                    for (int j = N/2; j < N; j++) {
                        arr[i]++;
                        arr[j]--;
                    }
                }
            }
            break;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(N+1);
    }
}