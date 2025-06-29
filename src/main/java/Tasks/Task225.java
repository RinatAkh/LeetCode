package Tasks;

import java.util.LinkedList;
import java.util.Queue;

public class Task225 {
    private Queue<Integer> queue;
    public Task225() {
        this.queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        for(int i = 0; i < queue.size()-1; i++) {
            int temp = queue.poll();
            queue.offer(temp);
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
