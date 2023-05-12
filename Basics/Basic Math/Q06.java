package BasicMath;

import java.util.Scanner;

/*
 * Given a positive integer N., The task is to find the value of 
 * \sum_{i=1}^{i=n} F(i)  where function F(i) for the number i
 *  be defined as the sum of all divisors of ‘i‘.
 */
public class Q06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Number  : ");
        int n = in.nextInt();
        long d = 0;
        for (int i = 1; i <= n; i++) {
            d = d + i * (n / i);
        }
        System.out.print("\nSum of All Divisors is : " + d);
        in.close();
    }
}
