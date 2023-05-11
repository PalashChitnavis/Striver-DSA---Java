package Pattern;

import java.util.Scanner;

/*
    * * * * *
    * * * * 
    * * * 
    * *  
    * 
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Rows : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
