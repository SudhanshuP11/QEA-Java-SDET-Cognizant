package qea.QualifierPracticeQue.Arrays;

import java.util.Scanner;

public class arraySumAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =  sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element: ");
            a[i] = sc.nextInt();
        }
        int sum=0;
        for(int b:a){
            sum+=b;
        }
        System.out.println(" the sum is : "+sum);
        double c = (double)sum/n;
        System.out.println("The average is "+c);
    }
}
