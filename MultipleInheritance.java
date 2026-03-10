// Interface 1
interface Animal {
    void eat();
}

// Interface 2
interface Vehicle {
    void drive();
}

// Class implementing multiple interfaces
class Car implements Animal, Vehicle {
    @Override
    public void eat() {
        System.out.println("Car owner eats");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

// Main class
public class MultipleInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.eat();
        car.drive();
    }
}