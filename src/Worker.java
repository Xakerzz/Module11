import java.util.Deque;
import java.util.Queue;

public class Worker {
    private Deque toDoDque;

    public Worker(Deque toDoDque) {
        this.toDoDque = toDoDque;
    }

    public void takeTask(){
        Object task = toDoDque.pollLast();
        if (task!=null){
            System.out.println("do task " + task);
        }else {
            System.out.println("Nothing to do, we can go home!");
        }
    }
}
