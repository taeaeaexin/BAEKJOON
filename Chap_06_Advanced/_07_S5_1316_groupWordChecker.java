package Chap_06_Advanced;

import java.util.Scanner;

public class _07_S5_1316_groupWordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean f = true;

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            char arr[] = new char[str.length()];
            for (int j = 0; j < str.length(); j++)
                arr[i] = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if (j < str.length() - 1) {
                    for (int k = j + 1; k < str.length(); k++) {
                        if (f == true && arr[j] == arr[k])

                    }
                }

            }

        }
    }
}
