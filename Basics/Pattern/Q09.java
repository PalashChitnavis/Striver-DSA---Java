package Pattern;

import java.util.Scanner;

/*
 *       *
 *      * *
 *     * * *
 *    * * * *
 *   * * * * *
 *    * * * * 
 *     * * *
 *      * *
 *       *
 */
public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int sp = n - i;
            int st = i;
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for (int i = 1; i <= n; i++) {
            int sp = i - 1;
            int st = (n - i + 1);
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        in.close();
    }

}
