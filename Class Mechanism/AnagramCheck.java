import java.util.Arrays;

class AnagramCheck {
    public static void main(String[] args) {

        String str1 = "CAT";
        String str2 = "ACT";

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("The strings are Anagrams");
        else
            System.out.println("The strings are NOT Anagrams");
    }
}