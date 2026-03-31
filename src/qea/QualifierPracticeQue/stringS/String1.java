package qea.QualifierPracticeQue.stringS;

import java.util.Scanner;

// count length of the string withou using length
public class String1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = sc.nextLine();
        System.out.println(a.length());
        char[] b = a.toCharArray();
        int count =0;
        for(char c :b){
            count++;
        }
        System.out.print(count);
    }
}
