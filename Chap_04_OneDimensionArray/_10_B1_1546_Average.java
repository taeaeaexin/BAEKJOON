package Chap_04_OneDimensionArray;

import java.util.Scanner;

public class _10_B1_1546_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[sc.nextInt()];
        double max = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max)
                max = arr[i];
        }

        sc.close();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]*100 / max;
        }

        System.out.println(sum/arr.length);

    }
}
