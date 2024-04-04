package Chap_08_GeneralMath;

import java.util.Scanner;

public class _03_B3_2720_laundryOwner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int Q = 25, D = 10, N = 5, P = 1;

        for (int i = 0; i < T; i++) {
            int money = sc.nextInt();
            int Qn = 0, Dn = 0, Nn = 0, Pn = 0;

            Qn = money / Q;
            money %= Q;
            Dn = money / D;
            money %= D;
            Nn = money / N;
            money %= N;
            Pn = money / P;

            System.out.println(Qn + " " + Dn + " " + Nn + " " + Pn);
        }

    }
}
