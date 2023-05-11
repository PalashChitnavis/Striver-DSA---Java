package Pattern;

import java.util.Scanner;

/*
    **********
    ****  ****
    ***    ***
    **      **
    *        *
    *        *
    **      **
    ***    ***
    ****  ****
    **********
 */
public class Q19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (i <= n && j <= n - i + 1) {
                    System.out.print("*");
                } else if (i <= n && j > n - i + 1 && j <= n + i - 1) {
                    System.out.print(" ");
                } else if (i <= n && j > n + i - 1 && j <= 2 * n) {
                    System.out.print("*");
                } else if (i > n && j <= i - n) {
                    System.out.print("*");
                } else if (i > n && j > i - n && j <= 3 * n - i) {
                    System.out.print(" ");
                } else if (i > n && j > 3 * n - i && j <= 2 * n) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        in.close();
    }

}
