import java.util.*;

public class EmployeeDriverClass {

    public static void main(String[] args) {

        // ArrayList is part of Java Collection Framework
        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee(103, "Ravi", 45000));
        empList.add(new Employee(101, "Anil", 60000));
        empList.add(new Employee(102, "Kiran", 50000));

        System.out.println("----- Original List -----");
        printEmployees(empList);

        // Iterable & Iterator usage
        System.out.println("\n----- Using Iterator -----");
        for (Employee employee : empList) {
            System.out.println(employee);
        }

        // Comparable sorting (by ID)
        Collections.sort(empList);
        System.out.println("\n----- Sorted by ID (Comparable) -----");
        printEmployees(empList);

        // Comparator sorting (by Salary)
        empList.sort(new SalaryComparator());
        System.out.println("\n----- Sorted by Salary (Comparator) -----");
        printEmployees(empList);

        // Comparator sorting (by Name)
        empList.sort(new NameComparator());
        System.out.println("\n----- Sorted by Name (Comparator) -----");
        printEmployees(empList);
    }

    // Iterable demonstration
    public static void printEmployees(Iterable<Employee> empList) {
        for (Employee e : empList) {
            System.out.println(e);
        }
    }
}