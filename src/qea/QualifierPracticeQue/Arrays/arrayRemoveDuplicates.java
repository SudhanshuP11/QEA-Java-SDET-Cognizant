package qea.QualifierPracticeQue.Arrays;

import java.util.Scanner;

public class arrayRemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =  sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element: ");
            a[i] = sc.nextInt();
        }
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // check if arr[i] appeared before current position
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true; // found duplicate
                    break;
                }
            }

            // only print if not a duplicate
            if (!isDuplicate) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
