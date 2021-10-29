package Wildcard;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> keywords = new LinkedList<>();
        keywords.add("JAVA");
        printList(keywords);

        List<Integer> numberList = new LinkedList<>();
        for (int i = 20; i >0 ; i--) {
            numberList.add(i);
        }
        printList(numberList);


        //printList1(numberList);

        LinkedList<Integer> linkedList = (LinkedList<Integer>) numberList;
        System.out.println(linkedList.peek());

    }
   private static void printList (Queue<?> keywords){
       for (Object o: keywords) {
           System.out.println(o);
       }
   }

    private static void printList (List<? extends Number> list){
        long count = 0;
        for (Number number:list) {
            System.out.println(number);

        }
    }

    private static void printList1 (List<?super Number> list){
        for (Object o: list) {
            System.out.println(o);
        }
        for (int i = 0; i <20 ; i++) {
           int j = (int)(Math.random()*10);
            list.add(j);
            for (int k = 0; k <20 ; k++) {
                double u = Math.random()*100;
                list.add(u);
                for (int l = 0; l <20 ; l++) {
                    long h = (long)(Math.random()*1_000_000_000L);
                    list.add(h);

                }
            }
        }

        for (Object o:list) {
            System.out.println(o);
        }
    }


}
