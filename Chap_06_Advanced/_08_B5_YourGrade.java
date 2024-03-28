package Chap_06_Advanced;

import java.util.Scanner;

public class _08_B5_YourGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double sum2 = 0;

        for (int i = 0; i < 20; i++) {
            String S = sc.next();
            double d = sc.nextDouble();
            String str = sc.next();

            if (!str.equals("P")) {
                sum2 += d;
                switch (str) {
                    case "A+":
                        d *= 4.5;
                        break;
                    case "A0":
                        d *= 4.0;
                        break;
                    case "B+":
                        d *= 3.5;
                        break;
                    case "B0":
                        d *= 3.0;
                        break;
                    case "C+":
                        d *= 2.5;
                        break;
                    case "C0":
                        d *= 2.0;
                        break;
                    case "D+":
                        d *= 1.5;
                        break;
                    case "D0":
                        d *= 1.0;
                        break;
                    case "F":
                        d *= 0.0;
                        break;

                }
                sum += d;
            }

        }
        System.out.println(sum / sum2);

    }
}
