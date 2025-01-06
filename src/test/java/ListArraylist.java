import java.util.ArrayList;
import java.util.List;

public class ListArraylist {
    public static void main(String[] args) {
        //store element in order of input. Duplicate accepted.
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

//        System.out.println(names);

        for (String name1 : names) {
            System.out.println(name1);
        }
    }
}
