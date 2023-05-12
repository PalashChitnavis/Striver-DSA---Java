package BasicMath;

import java.util.Scanner;

/*
Given an array of N integers arr[] where each element represents the maximum length
of the jump that can be made forward from that element. This means if arr[i] = x,   
then we can jump any distance y such that y ≤ x.
Find the minimum number of jumps to reach the end of the array (starting from the first element).
If an element is 0, then you cannot move through that element.
Note: Return -1 if you can't reach the end of the array.
 */
public class Q07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Size of Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("\nEnter Array Elements : \n");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = in.nextInt();
            System.out.print("\n");
        }
        int index = 0;
        int jumps = 0;
        for (int i = 0; i < n;) {
            if (arr[i] == 0 && i != n - 1) {
                jumps = 0;
                break;
            }
            index = index + arr[i];
            jumps++;
            if (index >= n - 1) {
                break;
            }
            if (index < n - 1) {
                i = index;
                continue;
            }

        }
        System.out.println("\nJumps are : " + jumps);
        in.close();
    }
}
