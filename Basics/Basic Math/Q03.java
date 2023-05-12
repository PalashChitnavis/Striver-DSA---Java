package BasicMath;

import java.util.Scanner;

/*
 *  Given an integer, check whether it is a palindrome or not.
 */
public class Q03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a Number : ");
        int n = in.nextInt();
        int x = n;
        int rev = 0;
        int rem;
        while (x > 0) {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        System.out.println(rev);
        if (rev == n) {
            System.out.print("\nNumber " + n + " is a Palindrome Number");
        } else {
            System.out.print("\nNumber " + n + " is a Not a  Palindrome Number");
        }
        in.close();
    }
}
