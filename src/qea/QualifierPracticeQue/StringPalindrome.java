package qea.QualifierPracticeQue;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String rev= new StringBuilder(s).reverse().toString();
        System.out.print(s.equals(rev));

    }
}
