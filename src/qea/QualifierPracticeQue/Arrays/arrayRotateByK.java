package qea.QualifierPracticeQue.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayRotateByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =  sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter k positions to rotate: ");
        int k = sc.nextInt();

        // handle if k is greater than array length
        k = k % n;
        // temp array to store rotated result
        int[] temp = new int[n];

        // copy elements from index k to end
        int idx = 0;
        for (int i = k; i < n; i++) {
            temp[idx++] = a[i];
        }

        // copy elements from index 0 to k
        for (int i = 0; i < k; i++) {
            temp[idx++] = a[i];
        }

        System.out.println("Original Array : " + Arrays.toString(a));
        System.out.println("Rotated Array  : " + Arrays.toString(temp));
    }
}
