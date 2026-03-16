import java.util.Hashtable;
import java.util.Enumeration;

public class HashTableDemo {
    public static void main(String[] args) {
        System.out.println("--- HashTable Example ---");

        // HashTable: Legacy class, Synchronized (Thread-safe), No null keys/values
        Hashtable<String, String> capitalCity = new Hashtable<>();
        capitalCity.put("India", "New Delhi");
        capitalCity.put("USA", "Washington, D.C.");
        capitalCity.put("UK", "London");
        capitalCity.put("Japan", "Tokyo");

        System.out.println("HashTable: " + capitalCity);

        // Using Enumeration (Legacy way to iterate)
        System.out.println("\nIterating using Enumeration:");
        Enumeration<String> keys = capitalCity.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(key + " -> " + capitalCity.get(key));
        }

        // HashTable doesn't allow null
        try {
            capitalCity.put(null, "Value");
        } catch (NullPointerException e) {
            System.out.println("\nCaught expected NullPointerException: HashTable doesn't allow null keys.");
        }
    }
}
