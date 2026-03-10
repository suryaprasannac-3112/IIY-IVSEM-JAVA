class Person {
    String name;
    int age;
    String address;
    String qualification;
    // Constructor
    Person(String name, int age, String address, String qualification) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.qualification = qualification;
    }
    // Method to display personal details
    void displayPersonalDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    // Method to display qualification details
    void displayQualificationDetails() {
        System.out.println("Qualification: " + qualification);
    }
    public static void main(String[] args) {
        Person p1 = new Person(
            "SURYA PRASANNA",
            18,
            "Kutukuluru, AP",
            "B.Tech in AIML"
        );
        p1.displayPersonalDetails();
        p1.displayQualificationDetails();
    }
}
