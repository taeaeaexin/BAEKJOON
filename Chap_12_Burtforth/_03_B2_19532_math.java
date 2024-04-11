package Chap_12_Burtforth;

import java.io.*;
import java.util.StringTokenizer;

public class _03_B2_19532_math {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int x = 0;
        int y = 0;

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (a * i + b * j == c) {
                    if (d * i + e * j == f) {
                        bw.write(i + " " + j + "\n");
                        break;
                    }
                }

            }
        }
        bw.flush();
        bw.close();

    }
}
