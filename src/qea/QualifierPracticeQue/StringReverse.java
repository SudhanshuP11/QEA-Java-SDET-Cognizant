package qea.QualifierPracticeQue;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String rev = new StringBuilder(sc.nextLine()).reverse().toString();
        System.out.println(rev);
    }
}

