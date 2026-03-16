class Student {
    String name;
    int age;
    // Default constructor
    Student() {
        name = "Not Assigned";
        age = 0;
    }
    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Student 1 Details:");
        s1.display();
        System.out.println();
        Student s2 = new Student("Prasanna", 19);
        System.out.println("Student 2 Details:");
        s2.display();
    }
}
