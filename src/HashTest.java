import java.util.*;

public class HashTest {
   private static final  float loadIndex = 0.9F;
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>(25);
        Set<String> set3 = new HashSet<>(25, loadIndex);
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Sam");
        list.add("Mary");
        list.add("Smith");
        list.add("Adam");
        Set<String> set = new HashSet<>(list);
        for (Object o: list) {
            System.out.println(o.hashCode() + " " + o.toString());
        }
        Deque <Integer> deque = new ArrayDeque<>();
        deque.push(2);
    }
}
