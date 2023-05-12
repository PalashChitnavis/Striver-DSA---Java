package BasicMath;

import java.util.Scanner;

/*
 * Given a 32 bit number X, reverse its binary form and print the answer in decimal.
 */
public class Q02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a Number : ");
        Long n = in.nextLong();
        String b = Long.toBinaryString(n);
        String nb = String.format("%32s", b).replaceAll(" ", "0");
        System.out.println(nb);
        StringBuilder rbn = new StringBuilder(nb);
        String rbnib = rbn.reverse().toString();
        System.out.println(rbnib);
        Long ri = Long.parseLong(rbnib, 2);
        System.out.println(ri);
        in.close();
    }

}
