package DSA.Arrays;

import java.util.Scanner;

/*
 * Given an array arr[] of size N, check if it is sorted in non-decreasing order or not. 
 */
public class E03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Size Of Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nElement " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }
        int flag = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.print("\nArray is not Sorted");
        } else {
            System.out.print("\nArray is Sorted");
        }
        in.close();
    }
}
