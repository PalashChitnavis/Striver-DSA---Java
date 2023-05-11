package Pattern;

import java.util.Scanner;

/*
    1 
    0 1 
    1 0 1
    0 1 0 1 
    1 0 1 0 1
 */
public class Q11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
