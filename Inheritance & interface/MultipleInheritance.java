interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {

    public void showFather() {
        System.out.println("This is father's method");
    }

    public void showMother() {
        System.out.println("This is mother's method");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Child c = new Child();

        c.showFather();
        c.showMother();
    }
}