// User-defined Exception
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        System.out.println("--- Built-in and User-defined Exceptions Demo ---");

        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught User-defined Exception: " + e.getMessage());
        }

        try {
            // Built-in Runtime Exception: NullPointer
            String str = null;
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught Built-in Exception: NullPointerException occurred.");
        }
    }

    // Method illustrating throwing a custom exception
    public static void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is not valid for voting. Age must be 18+");
        } else {
            System.out.println("Welcome to vote!");
        }
    }
}
