import java.util.Deque;
import java.util.Queue;

public class Boss {
    private Deque toDoDeque;

    public Boss(Deque toDoDeque) {
        this.toDoDeque = toDoDeque;
    }
    public void giveTask(String task){
        toDoDeque.add(task);
        System.out.println("Given the task " + task);
    }
}
