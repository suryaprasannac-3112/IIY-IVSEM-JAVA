public class MultipleCatchDemo {
    public static void main(String[] args) {
        System.out.println("--- Multiple Catch Clauses Demo ---");
        
        try {
            int[] numbers = {10, 20, 30};
            int divisor = 0;
            
            // This might throw ArithmeticException
            int result = numbers[1] / divisor;
            System.out.println("The result is: " + result);
            
            // This might throw ArrayIndexOutOfBoundsException
            System.out.println("Accessing element at index 5: " + numbers[5]);
            
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            // General catch for any other exception
            System.out.println("Caught General Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (runs regardless of exception).");
        }
        
        System.out.println("Program execution continues after catch blocks.");
    }
}
