package qea.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.print("How many students do you want to add? ");
        int count = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character

        // 1. Input Loop
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            students.add(name); // Adding to ArrayList
        }

        // 2. Output Loop (Enhanced For-Loop)
        System.out.println("\n--- Student List ---");
        for (String s : students) {
            System.out.println("Name: " + s);
        }

        sc.close();
    }
}