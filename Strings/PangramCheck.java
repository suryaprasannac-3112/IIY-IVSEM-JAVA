package Strings;

import java.util.Scanner;

public class PangramCheck {
    public static boolean isPangram(String str) {
        if (str == null || str.length() < 26) {
            return false;
        }
        
        boolean[] alphabetPresent = new boolean[26];
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabetPresent[c - 'a'] = true;
            }
        }
        
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Pangram Checker ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (isPangram(input)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is NOT a pangram.");
        }
        scanner.close();
    }
}
