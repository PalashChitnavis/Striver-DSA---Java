package Pattern;

import java.util.Scanner;

/*
    *        *
    **      **
    ***    ***
    ****  ****
    **********
    ****  ****
    ***    ***
    **      **
    *        *
 */
public class Q20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (i <= n && j <= i) {
                    System.out.print("*");
                } else if (i <= n && j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                } else if (i <= n && j > 2 * n - i && j <= 2 * n) {
                    System.out.print("*");
                } else if (i > n && j <= 2 * n - i) {
                    System.out.print("*");
                } else if (i > n && j > 2 * n - i && j <= i) {
                    System.out.print(" ");
                } else if (i > n && j > i && j <= 2 * n) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        in.close();
    }

}
