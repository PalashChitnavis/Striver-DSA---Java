package Pattern;

import java.util.Scanner;

/*
 *  1
 *  12
 *  123
 *  1234
 *  12345
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j) + " ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
