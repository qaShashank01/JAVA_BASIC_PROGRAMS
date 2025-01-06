import java.util.Map;
import java.util.TreeMap;

public class TreemapUse {
    public static void main(String[] args) {
        Map<Integer, String> names = new TreeMap<>();
        names.put(2, "Bob");
        names.put(1, "Alice");
        names.put(2, "Bob");
        names.put(3, "Charlie");

        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
