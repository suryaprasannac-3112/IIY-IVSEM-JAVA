class Person {

    String name;
    int age;
    String degree;
    String university;

    void personalDetails(String n, int a) {
        name = n;
        age = a;

        System.out.println("Personal Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void qualificationDetails(String d, String u) {
        degree = d;
        university = u;

        System.out.println("Qualification Details");
        System.out.println("Degree: " + degree);
        System.out.println("University: " + university);
    }

    public static void main(String[] args) {
        Person p = new Person();

        p.personalDetails("Prasanna", 20);
        p.qualificationDetails("B.Tech AIML", "XYZ University");
    }
}