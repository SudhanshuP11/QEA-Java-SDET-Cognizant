package qea.corejava;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class RegexExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rule: Only digits [0-9], and exactly 10 of them {10}
        String patternString = "[0-9]{10}";
        Pattern pattern = Pattern.compile(patternString);

        System.out.print("Enter your 10-digit Phone Number: ");
        String input = sc.next();

        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid Phone Number!");
        } else {
            System.out.println("Invalid! Please enter exactly 10 digits.");
        }
    }
}