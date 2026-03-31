package qea.QualifierPracticeQue.collectionFrameWork;

import java.util.HashSet;
import java.util.Scanner;

public class classHashSet {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        System.out.println("Enter the number of elements in the set: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the set: ");
        for(int j=0;j<n;j++){
            set.add(sc.next());
        }
        System.out.println("Enter the elements in the set: ");
        for(String s:set){
            System.out.print(s+" ");
        }
    }
}
