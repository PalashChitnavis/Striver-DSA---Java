package Pattern;

import java.util.Scanner;

/*
    4 4 4 4 4 4 4
    4 3 3 3 3 3 4
    4 3 2 2 2 3 4
    4 3 2 1 2 3 4
    4 3 2 2 2 3 4
    4 3 3 3 3 3 4
    4 4 4 4 4 4 4
 */
public class Q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (i <= n && j <= i) {
                    System.out.print(n - j + 1 + " ");
                } else if (i <= n && j > i && j <= 2 * n - i - 1) {
                    System.out.print(n - i + 1 + " ");
                } else if (i <= n && j > 2 * n - i - 1 && j < 2 * n) {
                    System.out.print(j - n + 1 + " ");
                } else if (i > n && j <= 2 * n - i) {
                    System.out.print(n - j + 1 + " ");
                } else if (i > n && j > 2 * n - i && j <= i - 1) {
                    System.out.print(i - n + 1 + " ");
                } else if (i > n && j > i - 1 && j < 2 * n) {
                    System.out.print(j - n + 1 + " ");
                }
            }
            System.out.print("\n");
        }
        in.close();
    }
}