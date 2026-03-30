package qea.QualifierPracticeQue;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string1: ");
        String a = sc.nextLine();
        System.out.println("Enter a string2: ");
        String b = sc.nextLine();
        char [] ca = a.toCharArray(),  cb = b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        System.out.print(Arrays.equals(ca,cb));
    }
}
