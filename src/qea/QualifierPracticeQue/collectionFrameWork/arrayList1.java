package qea.QualifierPracticeQue.collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the size of the array list");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array list:");
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for(int i=0;i<size;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("Rverse: ");
        Collections.reverse(list);
        for(int i=0;i<size;i++){
            System.out.print(list.get(i)+" ");
        }



    }
}
