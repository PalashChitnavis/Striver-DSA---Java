package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Given an array of size N. The task is to rotate array by D elements where D ≤ N.
 */
public class E06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Size Of Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nElement " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }
        System.out.print("\nEnter Rotating Index K : ");
        int k = in.nextInt();
        k = n - k % n;
        int arr_new[] = new int[n];

        // new index = (old index + k) % size

        for (int i = 0; i < n; i++) {
            arr_new[(i + k) % n] = arr[i];
        }
        System.out.println(Arrays.toString(arr_new));

        in.close();
    }
}
