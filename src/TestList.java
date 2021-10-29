import java.util.LinkedList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        for (int i = 0; i <3 ; i++) {
            list1.add(i);
        }
        //System.out.println(list1.get(list1.size()));

        LinkedList<Integer> list = new LinkedList<>();
        list.add(15);
        list.addLast(28);
        list.remove(0);
        list.set(0,33);
        list.addFirst(null);
        List<Integer> anotherList = list; // 1
        System.out.println(anotherList);
    }
}
