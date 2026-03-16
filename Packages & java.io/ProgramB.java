import com.derived.DerivedClass;

public class ProgramB {
    public static void main(String[] args) {
        System.out.println("Program B: Illustrate the use of protected members in a package.");
        DerivedClass obj = new DerivedClass();
        obj.accessProtectedMembers();
    }
}
