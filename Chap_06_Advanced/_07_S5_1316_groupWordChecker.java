package Chap_06_Advanced;

import java.util.Scanner;

public class _07_S5_1316_groupWordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count3 = 0;

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            int arr[] = new int[26];
            int count = 1;
            int count2 = 0;

            for (int j = 0; j < str.length(); j++) {
                if (j < str.length() - 1 && str.charAt(j) != str.charAt(j + 1))
                    count++;

                arr[(int) str.charAt(j) - 'a'] = 1;
            }

            for (int j = 0; j < arr.length; j++)
                count2 += arr[j];

            if (count == count2)
                count3++;
        }
        sc.close();
        System.out.println(count3);
    }

}



