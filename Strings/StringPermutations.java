package Strings;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static List<String> getPermutations(String str) {
        List<String> result = new ArrayList<>();
        if (str == null) return result;
        if (str.isEmpty()) {
            result.add("");
            return result;
        }
        
        char first = str.charAt(0);
        String remainder = str.substring(1);
        List<String> words = getPermutations(remainder);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String prefix = word.substring(0, i);
                String suffix = word.substring(i);
                result.add(prefix + first + suffix);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- String Permutations Generator ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        List<String> permutations = getPermutations(input);
        System.out.println("Total permutations: " + permutations.size());
        System.out.println("Permutations: " + permutations);
        
        scanner.close();
    }
}
