import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        System.out.println("--- HashSet vs TreeSet ---");

        // HashSet: No duplicates, no guaranteed order
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Apple"); // Duplicate
        System.out.println("HashSet (Unordered, no duplicates): " + hashSet);

        // TreeSet: No duplicates, sorted order
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Apple"); // Duplicate
        System.out.println("\nTreeSet (Sorted, no duplicates): " + treeSet);
    }
}
