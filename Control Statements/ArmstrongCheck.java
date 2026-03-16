public class ArmstrongCheck {
    public static void main(String[] args) {
        int num = 153; // test value, can be any integer
        System.out.println(num + (isArmstrong(num) ? " is " : " is not ") + "an Armstrong number.");
    }

    private static boolean isArmstrong(int number) {
        if (number < 0) return false; // typically Armstrong defines nonnegative numbers
        int original = number;
        int digits = String.valueOf(number).length();
        int sum = 0;
        while (number > 0) {
            int d = number % 10;
            sum += Math.pow(d, digits);
            number /= 10;
        }
        return sum == original;
    }
}
