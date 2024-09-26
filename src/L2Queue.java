import java.util.LinkedList;
import java.util.Queue;

public class L2Queue {
    public static void main(String[] args) {
        // FIFO Data Structure - First In First Out
        Queue<String> queue = new LinkedList<>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);

        System.out.println(queue.peek());

        queue.poll();

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);

        // -> offer, pool and peek do not throw Exceptions :)

        System.out.println(queue.isEmpty());

        System.out.println(queue.size());

        System.out.println(queue.contains("Harold"));

    }
}
