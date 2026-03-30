package qea.QualifierPracticeQue.Arrays;

import java.util.Scanner;

public class arrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =  sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element: ");
            a[i] = sc.nextInt();
        }
        int max = a[0],min = a[0];
        for(int c:a){
            if(c>max) max=c;
            if (c<min) min=c;
        }
        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);
    }
}
