package Chap_13_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_B2_2750_numSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] < arr[j]) {
                    int n = arr[i];
                    arr[i] = arr[j];
                    arr[j] = n;
                }
            }
        }

        for (int i = N - 1; i >= 0; i--)
            System.out.println(arr[i]);
    }
}
