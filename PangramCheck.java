import java.util.Scanner;

class PangramCheck {

    static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }
        for (boolean present : alphabet) {
            if (!present) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        if (isPangram(input)) {
            System.out.println("The given string is a Pangram.");
        } else {
            System.out.println("The given string is NOT a Pangram.");
        }
        sc.close();
    }
}

