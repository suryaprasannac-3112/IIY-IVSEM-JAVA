class PangramCheck {
    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog";
        str = str.toLowerCase();

        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        boolean isPangram = true;

        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                isPangram = false;
                break;
            }
        }

        if (isPangram)
            System.out.println("The string is a Pangram");
        else
            System.out.println("The string is NOT a Pangram");
    }
}