public class Primes1to100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");
        for (int n = 2; n <= 100; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        int limit = (int) Math.sqrt(num);
        for (int i = 5; i <= limit; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}