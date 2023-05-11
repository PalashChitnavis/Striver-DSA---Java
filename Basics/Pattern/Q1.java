package Pattern;

import java.util.Scanner;

/*
 *  *****
 *  *****
 *  *****
 *  *****
 *  *****
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
