package Pattern;

import java.util.Scanner;

/*
    ABCDE
    ABCD
    ABC
    AB
    A
 */
public class Q15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
