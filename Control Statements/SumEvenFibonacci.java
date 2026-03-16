public class SumEvenFibonacci {
    public static void main(String[] args) {
        int N = 100; // or any given range value
        System.out.println("Sum of even Fibonacci terms up to " + N + " = " + sumEvenFib(N));
    }

    private static long sumEvenFib(int N) {
        if (N < 2) return 0;
        long sum = 0;
        long a = 1, b = 2; // F1=1, F2=2
        if (b <= N) sum += b;
        while (true) {
            long c = a + b; // next Fibonacci
            if (c > N) break;
            if ((c & 1) == 0) sum += c;
            a = b;
            b = c;
        }
        return sum;
    }
}