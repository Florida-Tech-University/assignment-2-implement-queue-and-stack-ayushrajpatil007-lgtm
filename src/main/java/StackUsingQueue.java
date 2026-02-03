public class StackUsingQueue implements StackADT {

    private ArrayQueue q1;
    private ArrayQueue q2;
    private int capacity;
    private int size;

    public StackUsingQueue(int capacity) {
        this.capacity = capacity;
        q1 = new ArrayQueue(capacity);
        q2 = new ArrayQueue(capacity);
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public void push(int x) {
        if (isFull()) {
            return; // NO exception
        }

        q2.enqueue(x);

        while (!q1.isEmpty()) {
            q2.enqueue(q1.dequeue());
        }

        ArrayQueue temp = q1;
        q1 = q2;
        q2 = temp;

        size++;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        size--;
        return q1.dequeue();
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return q1.peek();
    }

    @Override
    public int size() {
        return size;
    }
}









