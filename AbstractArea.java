// Abstract class
abstract class Shape {
    abstract void area();
}

// Rectangle class
class Rectangle extends Shape {
    double length = 10;
    double breadth = 5;

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

// Circle class
class Circle extends Shape {
    double radius = 7;

    void area() {
        System.out.println("Area of Circle = " + (Math.PI * radius * radius));
    }
}

// Triangle class
class Triangle extends Shape {
    double base = 8;
    double height = 6;

    void area() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

// Main class
public class AbstractArea {
    public static void main(String[] args) {

        Shape s;

        s = new Rectangle();
        s.area();

        s = new Circle();
        s.area();

        s = new Triangle();
        s.area();
    }
}
