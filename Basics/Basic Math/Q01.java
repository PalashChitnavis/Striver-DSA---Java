package BasicMath;

import java.util.Scanner;

/*
 * Given a number N. Count the number of digits in N which evenly divides N.
 */
public class Q01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter A Number : ");
        int n = in.nextInt();
        int x = n;
        int rem;
        int i = 0;
        int[] evendivisor = new int[10];
        while (x > 0) {
            rem = x % 10;
            x = x / 10;
            if (rem != 0 && n % rem == 0) {
                evendivisor[i] = rem;
                i++;
            }
        }
        System.out.print(
                "\nDigits in " + n + " which evenly divides " + n + " are : ");
        for (int j = 0; j < i; j++) {
            System.out.print(evendivisor[j] + "\t");
        }
        in.close();
    }
}
