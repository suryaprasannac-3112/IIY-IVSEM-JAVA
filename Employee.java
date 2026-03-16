public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Comparable: Natural sorting by ID
    @Override
    public int compareTo(Employee e) {
        return this.id - e.id;   // ascending order by id
    }

    @Override
    public String toString() {
        return id + "  " + name + "  " + salary;
    }
}