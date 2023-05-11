package Pattern;

import java.util.Scanner;

/*
    1 2 3 4 5
    1 2 3 4
    1 2 3 
    1 2  
    1 
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
