package BasicMath;

import java.util.Scanner;

/*
    For a given 3 digit number, find whether it is armstrong number or not. 
    An Armstrong number of three digits is an integer such that the sum of 
    the cubes of its digits is equal to the number itself. Return "Yes" if 
    it is a armstrong number else return "No".
    NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371
 */
public class Q05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Number  : ");
        int n = in.nextInt();
        int x = n;
        int armstrong = 0;
        int rem;
        while (x > 0) {
            rem = x % 10;
            armstrong = armstrong + rem * rem * rem;
            x = x / 10;
        }
        if (armstrong == n) {
            System.out.print("\nNumber " + n + " is a Armstrong Number");
        } else {
            System.out.print("\nNumber " + n + " is not a Armstrong Number");
        }
        in.close();
    }
}
