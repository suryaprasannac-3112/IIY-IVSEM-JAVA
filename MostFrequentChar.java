import java.util.Scanner;
class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine().toLowerCase();
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        int maxCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
            }
        }
        System.out.println("Most frequent character(s):");
        for (int i = 0; i < 256; i++) {
            if (freq[i] == maxCount && maxCount > 0) {
                System.out.println((char) i + " -> Frequency: " + maxCount);
            }
        }
        sc.close();
    }
}