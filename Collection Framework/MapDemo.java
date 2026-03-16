import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        System.out.println("--- HashMap vs TreeMap ---");

        // HashMap: Unordered, allows one null key, multiple null values
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(103, "C");
        hashMap.put(101, "A");
        hashMap.put(105, "E");
        hashMap.put(102, "B");
        System.out.println("HashMap (No guaranteed order): " + hashMap);

        // TreeMap: Sorted by keys, doesn't allow null keys
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(103, "C");
        treeMap.put(101, "A");
        treeMap.put(105, "E");
        treeMap.put(102, "B");
        System.out.println("\nTreeMap (Sorted by Keys): " + treeMap);
        
        System.out.println("\nIterating over Map:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
