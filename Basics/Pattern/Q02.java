package Pattern;

import java.util.Scanner;

/*
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
