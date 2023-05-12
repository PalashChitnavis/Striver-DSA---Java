package BasicMath;

import java.util.Scanner;

/*
 * Given two numbers A and B. The task is to find out their LCM and GCD.
 */
public class Q04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Number A : ");
        int a = in.nextInt();
        System.out.print("\nEnter Number B : ");
        int b = in.nextInt();
        int m = a, n = b;
        while (n != 0) {
            int t = n;
            n = m % n;
            m = t;
        }
        int hcf = m;
        int lcm = (a * b) / m;
        System.out.print("\nLCM is " + lcm + "\tHCF is " + hcf);
        in.close();
    }
}
