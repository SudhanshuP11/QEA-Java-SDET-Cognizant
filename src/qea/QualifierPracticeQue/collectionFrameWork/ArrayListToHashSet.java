package qea.QualifierPracticeQue.collectionFrameWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayListToHashSet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the ArrayList");
        int n = sc.nextInt();
        ArrayList<Integer> list  = new ArrayList<>();
        System.out.println("Enter the elements in the ArrayList");
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        HashSet<Integer> set = new HashSet<>(list);
        for (int s: set){
            System.out.print(s+" ");
        }

    }
}
