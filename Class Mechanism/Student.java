public class Student {
    private int id;
    private String name;

    // Default constructor
    public Student() {
        this.id = 0;
        this.name = "Unknown";
    }

    // Parameterized constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Prasanna");
        
        System.out.println("Student 1 Details:");
        s1.display();
        System.out.println("Student 2 Details:");
        s2.display();
    }
}
