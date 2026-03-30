package qea.QualifierPracticeQue.Arrays;

import java.util.Scanner;

public class arrayFindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =  sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int x = sc.nextInt();
        boolean found = false;
        for(int i=0;i<n;i++){
            if(a[i]==x) {
                System.out.println("The element " + x + " is found" + " at index " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("The element " + x + " is not found");
        }

    }
}
