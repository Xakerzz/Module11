import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tast11_4_6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            list.add(i);
            System.out.println(i);
        }

        for (int i = 99; i >=0 ; i--) {

            list.set(i,i);
            System.out.println(i);
        }

//        List<Integer> list = new LinkedList<>();
//
//        for (int i = 0; i < 100; i++) {
//            list.add(i);
//        }
//
//        for (int i = 0, j = 99; i < 50 && j >= 50; i++, j--) {
//            int start = list.get(i);
//            int end = list.get(j);
//            list.set(j, start);
//            list.set(i, end);
//        }
//
//        System.out.println(list);

    }
}
