import java.util.LinkedList;
import java.util.List;

public class ListLinkedlist {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Charlie");
        names.add("Bob");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
