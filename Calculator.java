class Calculator {
    // Method with two integer parameters
    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
    // Method with three integer parameters
    void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }
    // Method with two double parameters
    void add(double a, double b) {
        System.out.println("Sum of two double values: " + (a + b));
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10, 20);
        calc.add(10, 20, 30);
        calc.add(5.5, 4.5);
    }
}
