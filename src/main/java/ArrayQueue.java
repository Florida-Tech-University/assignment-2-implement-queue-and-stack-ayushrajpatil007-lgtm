public class ArrayQueue implements QueueADT {
   private int[] arr;
    private int front, rear, size, capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int x) {
        if (isFull()) return;
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) return -1;
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return arr[front];
    }
}


       
