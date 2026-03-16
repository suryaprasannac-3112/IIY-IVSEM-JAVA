import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        System.out.println("--- ArrayList vs LinkedList ---");

        // ArrayList: Better for random access (get/set)
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("ArrayList access element at index 1: " + arrayList.get(1));

        // LinkedList: Better for frequent insertions/deletions
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Spring");
        linkedList.add("Hibernate");
        linkedList.add("Maven");
        System.out.println("\nLinkedList: " + linkedList);
        
        // LinkedList specific methods (when used as Deque or List)
        LinkedList<String> ll = (LinkedList<String>) linkedList;
        ll.addFirst("Git");
        ll.addLast("Docker");
        System.out.println("LinkedList after addFirst/addLast: " + ll);
    }
}
