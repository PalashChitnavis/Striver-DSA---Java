package Pattern;

import java.util.Scanner;

/*
    E
    E D
    E D C
    E D C B
    E D C B A
 */
public class Q18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + n - j + 1) + " ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
