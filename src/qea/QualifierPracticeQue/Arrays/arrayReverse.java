package qea.QualifierPracticeQue.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayReverse {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =  sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element: ");
            a[i] = sc.nextInt();
        }
        int left =0 , right= a.length-1;
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        System.out.println("The reversed array is: "+ Arrays.toString(a));
    }
}
