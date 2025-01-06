import java.util.Set;
import java.util.TreeSet;

public class SetTreeset {
    public static void main(String[] args) {
        //store element in alphabetic order.not accept Duplicate.
        Set<String> names = new TreeSet<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Alice");
        names.add("alice");
        names.add("Bob");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
