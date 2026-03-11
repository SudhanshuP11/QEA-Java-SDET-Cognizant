package qea.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array list: ");
        int n = sc.nextInt();
        ArrayList<Integer>List = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter the element to be inserted at "+(i+1)+": ");
            List.add(sc.nextInt());
        }
        int sum=0;
        for(int s:List){
            sum+=s;
        }
        System.out.println("The sum of the elements in the array is: "+sum);
    }
}
