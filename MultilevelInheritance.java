// Base class (Parent)
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class (Child of Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Derived class (Child of Dog)
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy is playing");
    }
}

// Main class
public class MultilevelInheritance {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        // Accessing methods from all levels
        p.eat();    // From Animal class
        p.bark();  // From Dog class
        p.play();  // From Puppy class
    }
} 

