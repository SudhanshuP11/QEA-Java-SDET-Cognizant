package qea.QualifierPracticeQue.collectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class classWordCountSentence {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Sentence: " );
        String sentence = sc.nextLine();

        String[] word = sentence.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word1:word){
            map.put(word1, map.getOrDefault(word1,0)+1);

        }
        System.out.println("The Frequency of words in the sentence are: ");
        for(Map.Entry<String, Integer>entry:map.entrySet()){
            System.out.print(entry.getKey()+"->"+entry.getValue()+" ");
        }
    }
}
