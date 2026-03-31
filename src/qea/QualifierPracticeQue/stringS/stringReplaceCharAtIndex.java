package qea.QualifierPracticeQue.stringS;

import java.util.Scanner;

public class stringReplaceCharAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Enter the character to replace: ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the index of the character to replace: ");
        int index = sc.nextInt();
        if(index<=0 || index>=s.length()){
            System.out.println("Invalid index");
        }
        else System.out.println(s.substring(0,index)+ch+s.substring(index+1));
    }
}
