import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue implements StackADT {

    private Queue<Integer> q;
    private int capacity;

    public StackUsingQueue(int capacity) {
        this.capacity = capacity;
        q = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return q.isEmpty();
    }

    @Override
    public boolean isFull() {
        return q.size() == capacity;
    }

    @Override
    public void push(int x) {
        if (isFull()) {
            return;
        }
        q.add(x);
        int size = q.size();
        for (int i = 1; i < size; i++) {
            q.add(q.remove());
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return q.remove();
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return q.peek();
    }

    @Override
    public int size() {
        return q.size();
    }
}










