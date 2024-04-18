
import java.util.Arrays;
import java.util.Scanner;

public class _07_S5_11650_sortXY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[][] = new int[N][2];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        Arrays.sort(arr, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

/*

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i][0] > arr[j][0]) {
                    int x = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = x;
                    int y = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = y;
                } else if (arr[i][0] == arr[j][0] && arr[i][1] > arr[j][1]) {
                    int y = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = y;
                }
            }
        }
*/

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
