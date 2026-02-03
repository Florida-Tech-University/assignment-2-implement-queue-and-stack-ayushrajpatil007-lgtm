import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue implements StackADT {

    private Queue<Integer> q = new LinkedList<>();

    @Override
    public void push(int x) {
        q.add(x);
        int size = q.size();
        for (int i = 1; i < size; i++) {
            q.add(q.remove());
        }
    }

    @Override
    public int pop() {
        if (q.isEmpty()) return -1;
        return q.remove();
    }

    @Override
    public int peek() {
        if (q.isEmpty()) return -1;
        return q.peek();
    }

    @Override
    public boolean isEmpty() {
        return q.isEmpty();
    }
}






