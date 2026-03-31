package qea.QualifierPracticeQue.collectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class classHashMap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("Enter the number of elements in the set: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the set: ");
        for (int j=0;j<n;j++){
            System.out.println("Enter the student name: ");
            String a = sc.next();
            System.out.println("Enter the student marks: ");
            int b = sc.nextInt();
            map.put(a,b);
        }
        // loop through entries
        for(Map.Entry<String, Integer>entry:map.entrySet()){
            System.out.print(entry.getKey()+"->"+entry.getValue()+" ");
        }
    }
}
