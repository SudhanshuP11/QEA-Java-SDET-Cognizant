package qea.QualifierPracticeQue.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayLargestElement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =  sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element: ");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("The largest element is: "+a[a.length-1]);
        System.out.println("The Second largest element is: "+a[a.length-2]);

    }
}
