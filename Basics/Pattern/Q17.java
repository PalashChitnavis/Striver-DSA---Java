package Pattern;

import java.util.Scanner;

/*
        A
       ABA
      ABCBA
     ABCDCBA
    ABCDEDCBA 
 */
public class Q17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1 + i; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else if (j > n - i && j <= n) {
                    System.out.print((char) (j + i - n + 64));
                } else if (j > n) {
                    System.out.print((char) (64 + n + i - j));
                }
            }
            System.out.print("\n");
        }
        in.close();
    }
}
