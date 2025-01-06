import java.util.HashSet;
import java.util.Set;

public class SetHashMap {
    public static void main(String[] args) {
        //store element in random order.not accept Duplicate.
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Alice");
        names.add("alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
