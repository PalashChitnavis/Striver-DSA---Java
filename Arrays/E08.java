package DSA.Arrays;

import java.util.Scanner;

/*
 * Given an array arr[] sorted in ascending order of size N and an integer K.
 *  Check if K is present in the array or not.
 */
public class E08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Size Of Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nElement " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }
        System.out.print("\nEnter Integer K : ");
        int k = in.nextInt();
        int flag = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                count = i;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.print("\nElement " + k + " is present in Array at position " + count);
        } else {
            System.out.print("\nElement " + k + " is not present in Array");
        }
        in.close();
    }
}
