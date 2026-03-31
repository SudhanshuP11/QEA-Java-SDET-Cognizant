package qea.QualifierPracticeQue.stringS;

import java.util.Scanner;

public class stringUpperLower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }
}
