import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int numberOfTasks = 5;
        Deque toDoDeque = new ArrayDeque(numberOfTasks);
        Boss boss = new Boss(toDoDeque);
        Worker worker = new Worker(toDoDeque);
        for (int i = 1; i < numberOfTasks; i++) {
            boss.giveTask("Task " + i);
        }
        System.out.println("The boss ended to give tasks!");
        for (int i = 1; i < numberOfTasks+1; i++) {
            worker.takeTask();
        }
        
    }
}
