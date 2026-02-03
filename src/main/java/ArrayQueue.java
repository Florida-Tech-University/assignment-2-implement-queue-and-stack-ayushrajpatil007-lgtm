public class ArrayQueue implements QueueADT {

    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
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
    public void enqueue(int x) {
        if (isFull()) {
            return; // REQUIRED: no exception
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            return -1; // REQUIRED by autograder
        }
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            return -1; // REQUIRED
        }
        return arr[front];
    }
}






