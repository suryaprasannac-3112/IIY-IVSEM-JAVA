import java.util.Scanner;
class EvenFibonacciSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range N: ");
        int N = sc.nextInt();
        int a = 0, b = 1;
        int sum = 0;
        while (a <= N) {
            if (a % 2 == 0) {
                sum = sum + a;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Sum of even Fibonacci terms up to " + N + " is: " + sum);
        sc.close(); // Closing the Scanner
    }
}
