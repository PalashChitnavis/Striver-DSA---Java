package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Given an array arr[] of N positive integers. Push all the zeros of the given array
 *  to the right end of the array while maitaining the order of non-zero elements.
 */
public class E07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Size Of Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nElement " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }
        int[] arr_new = new int[n];
        int end = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr_new[n - 1 - end] = arr[i];
                end++;
            }
            if (arr[i] != 0) {
                arr_new[start] = arr[i];
                start++;
            }
        }
        System.out.println(Arrays.toString(arr_new));
        in.close();
    }
}
