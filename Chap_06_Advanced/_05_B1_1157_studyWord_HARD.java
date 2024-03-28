package Chap_06_Advanced;

import java.util.Scanner;

public class _05_B1_1157_studyWord_HARD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        int arr[] = new int[26];
        int max = -1;
        char answer = 0;

        for (int i = 0; i < str.length(); i++) {
            int N = str.charAt(i) - 'A';
            arr[N]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer = (char) (i + 'A');
            } else if (arr[i] == max)
                answer = '?';
        }

        System.out.println(answer);
        sc.close();
    }
}
