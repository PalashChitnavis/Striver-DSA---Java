package DSA.Arrays;

import java.util.Scanner;

/*
 * Given an array A[] of size n. The task is to find the largest element in it.
 */
public class E01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Size Of Array : ");
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nElement " + (i + 1) + " : ");
            a[i] = in.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.print("\nLargest Element is : " + max);
        in.close();
    }

}
