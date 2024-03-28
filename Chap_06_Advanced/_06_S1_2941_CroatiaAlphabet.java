package Chap_06_Advanced;

import java.util.Scanner;

public class _06_S1_2941_CroatiaAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        sc.close();

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1) {
                if (str.charAt(i) == 'c') {
                    if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-')
                        i++;
                } else if (str.charAt(i) == 'd' && str.charAt(i + 1) == '-')
                    i++;
                else if (i < str.length() - 2 && str.charAt(i) == 'd' && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=')
                    i += 2;
                else if ((str.charAt(i) == 'l' || str.charAt(i) == 'n') && str.charAt(i + 1) == 'j')
                    i++;
                else if ((str.charAt(i) == 's' || str.charAt(i) == 'z') && str.charAt(i + 1) == '=')
                    i++;
            }
            count++;
        }
        System.out.println(count);

    }
}
