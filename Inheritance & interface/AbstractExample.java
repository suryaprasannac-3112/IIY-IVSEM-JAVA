abstract class Shape {

    abstract void area();
}

class Circle extends Shape {

    double r = 5;

    void area() {
        double result = 3.14 * r * r;
        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle extends Shape {

    int length = 10;
    int breadth = 5;

    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }
}

class Triangle extends Shape {

    int base = 6;
    int height = 4;

    void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }
}

public class AbstractExample {
    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();

        s = new Triangle();
        s.area();
    }
}