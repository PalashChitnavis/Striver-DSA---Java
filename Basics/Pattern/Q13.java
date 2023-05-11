package Pattern;

import java.util.Scanner;

/*
    1 
    2 3 
    4 5 6 
    7 8 9 10 
    11 12 13 14 15
 */
public class Q13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        int k = 1;
        int t;
        for (int i = 1; i <= n; i++) {
            k = k + i - 1;
            t = k;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.print("\n");
            k = t;
        }
        in.close();
    }

}
