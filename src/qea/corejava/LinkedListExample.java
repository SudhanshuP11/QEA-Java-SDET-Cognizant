package qea.corejava;//import java.util.LinkedList;
//import java.util.*;
//public class qea.corejava.LinkedListExample {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Linked List Example");
//        System.out.println("Enter the number of elements in the list: ");
//        int n = sc.nextInt();
//        LinkedList<String> list = new LinkedList<>();
//        for(int i=0;i<n;i++)
//        {
//            System.out.println("Enter element "+(i+1)+": ");
//            list.add(sc.next());
//        }
//        for(String s: list){
//            System.out.println(s);
//        }
//    }
//}
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args) {
        // 1. Create a LinkedList of Strings
        LinkedList<String> nameList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter names (type 'done' to stop):");

        // 2. Use a while loop to let the user enter names
        while (true) {
            System.out.print("Input: ");
            String input = sc.nextLine();

            // 3. If the user types "done", stop the loop
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            // 4. Use addFirst() so the last name entered appears first
            nameList.addFirst(input);
        }

        // 5. Print the final list
        System.out.println("\n--- Final LinkedList (Last-in, qea.corejava.First-out order) ---");
        System.out.println(nameList);

        sc.close();
    }
}