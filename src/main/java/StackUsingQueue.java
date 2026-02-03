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

    @Overrid








