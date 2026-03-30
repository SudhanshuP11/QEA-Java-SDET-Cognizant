package qea.QualifierPracticeQue;

import java.util.Scanner;

public class stringVowelConsonent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        int vowel =0, consonent=0;
        for(char c: s.toCharArray()){
            char a = Character.toLowerCase(c);
            if(a>='a'&&a<='z'){
                if("aeiouAEIOU".indexOf(a)!=-1){
                    vowel++;
                }
                else  consonent++;
            }
        }
        System.out.println(vowel+" "+consonent);
    }
}
