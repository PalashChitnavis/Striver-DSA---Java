package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Given an array arr[] of size N and an integer K, the task is to left rotate the array K indexes
 */

public class E05 {
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
        // 2 4 6 8 - > 8 2 4 6
        // 2 4 6 8 - > 6 8 2 4
        // 2 4 6 8 - > 4 6 8 2
        // 2 4 6 8 - > 2 4 6 8

        // new index = (old index + k) % size

        // 3 6 9 - > 9 3 6
        // 3 6 9 - > 6 9 3
        // 3 6 9 - > 3 6 9

        for (int i = 0; i < n; i++) {
            arr_new[(i + k) % n] = arr[i];
        }
        System.out.println(Arrays.toString(arr_new));

        in.close();
    }
}
