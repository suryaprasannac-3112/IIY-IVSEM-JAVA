package Strings;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Anagram Checker ---");
        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();
        
        if (areAnagrams(s1, s2)) {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are NOT anagrams.");
        }
        scanner.close();
    }
}
