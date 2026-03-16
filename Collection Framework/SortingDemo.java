import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparable: Defined inside the class to provide natural ordering
class Product implements Comparable<Product> {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        // Natural ordering by ID
        return this.id - other.id;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
    }
}

// Comparator: Defined separately to provide multiple sorting logics
class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.price, p2.price);
    }
}

public class SortingDemo {
    public static void main(String[] args) {
        System.out.println("--- Comparator and Comparable ---");

        List<Product> products = new ArrayList<>();
        products.add(new Product(3, "Laptop", 85000));
        products.add(new Product(1, "Phone", 45000));
        products.add(new Product(2, "Tablet", 30000));

        System.out.println("Before Sorting: " + products);

        // Sorting using Comparable (Natural Order - ID)
        Collections.sort(products);
        System.out.println("\nSorted by ID (Comparable): " + products);

        // Sorting using Comparator (Price Order)
        Collections.sort(products, new PriceComparator());
        System.out.println("\nSorted by Price (Comparator): " + products);

        // Sorting using Lambda Comparator (Name Order)
        products.sort((p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println("\nSorted by Name (Lambda Comparator): " + products);
    }
}
