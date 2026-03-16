package Strings;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentChar {
    public static char findMostFrequentChar(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        }
        
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        char mostFrequent = '\0';
        int maxCount = -1;
        
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        
        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Most Frequent Character Finder ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char result = findMostFrequentChar(input);
        if (result != '\0') {
            System.out.println("The most frequent character is: '" + result + "'");
        } else {
            System.out.println("The string is empty.");
        }
        scanner.close();
    }
}
