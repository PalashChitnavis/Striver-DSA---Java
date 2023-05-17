package DSA.Arrays;

import java.util.Scanner;

/*
 * Vaibhav likes to play with numbers and he has N numbers.
 *  One day he was placing the numbers on the playing board just
 *  to count that how many numbers he has. He was placing the numbers 
 * in increasing order i.e. from 1 to N. But when he was putting the numbers 
 * back into his bag, some numbers fell down onto the floor. He picked up all 
 * the numbers but one number, he couldn't find. Now he has to go somewhere urgently,
 *  so he asks you to find the missing number.
    NOTE: Don't use Sorting
 */
public class E10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Size Of Array  : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            System.out.print("\nElement " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum = sum + arr[i];
        }
        System.out.print("\nMissing Element is " + ((n * (n + 1) / 2) - sum));
        in.close();
    }
}
