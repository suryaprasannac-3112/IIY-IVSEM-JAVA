import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        System.out.println("--- Iterator and Iterable ---");

        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Rust");

        // Iterable: List implements Iterable, so we can use for-each
        System.out.println("Using For-Each (Implicit Iterable):");
        for (String lang : languages) {
            System.out.println("- " + lang);
        }

        // Iterator: Explicit usage to traverse and modify during traversal
        System.out.println("\nUsing Explicit Iterator:");
        Iterator<String> iterator = languages.iterator();
        while (iterator.hasNext()) {
            String lang = iterator.next();
            System.out.println("Checking: " + lang);
            if (lang.equals("JavaScript")) {
                System.out.println("Removing " + lang);
                iterator.remove(); // Removing while iterating
            }
        }

        System.out.println("\nFinal List: " + languages);
    }
}
