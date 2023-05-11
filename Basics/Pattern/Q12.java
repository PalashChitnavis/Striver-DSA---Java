package Pattern;

import java.util.Scanner;

/*
    1                 1
    1 2             2 1
    1 2 3         3 2 1
    1 2 3 4     4 3 2 1
    1 2 3 4 5 5 4 3 2 1
 */
public class Q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= i) {
                    System.out.print(j + " ");
                }
                if (j > i && j <= 2 * n - i) {
                    System.out.print("  ");
                }
                if (j > (2 * n - i)) {
                    System.out.print((2 * n - j + 1) + " ");
                }
            }
            System.out.print("\n");
        }
        in.close();
    }

}
