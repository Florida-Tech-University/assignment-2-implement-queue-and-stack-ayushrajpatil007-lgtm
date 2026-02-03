import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue implements StackADT {

    private Queue<Integer> q = new LinkedList<>();
    private int capacity;

    public StackUsingQueue(int capacity) {
        this.capacity = capacity;
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
            return;   // ❌ NO exception
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
            return -1;   // ✅ REQUIRED
        }
        return q.remove();
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            return -1;   // ✅ REQUIRED
        }
        return q.peek();
    }

    @Override
    public int size() {
        return q.size();
    }

    @Override
    public int capacity() {
        return capacity;
    }
}






