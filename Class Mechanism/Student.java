class Student {

    int id;
    String name;

    // Default constructor
    Student() {
        id = 0;
        name = "Unknown";
        System.out.println("Default Constructor Called");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // Parameterized constructor
    Student(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parameterized Constructor Called");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();        // default constructor
        Student s2 = new Student(101, "Prasanna"); // parameterized constructor
    }
}