public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Initialize the queue with a fixed capacity
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Add an element to the rear of the queue (Enqueue)
    public boolean enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflows! Cannot enqueue " + value);
            return false;
        }
        // Circularly increment rear index
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }

    // Remove an element from the front of the queue (Dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflows! Cannot dequeue.");
            return -1;
        }
        int removedValue = queue[front];
        // Circularly increment front index
        front = (front + 1) % capacity;
        size--;
        return removedValue;
    }

    // Get the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    // Display the queue elements from front to rear
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    // Main method to test the circular queue
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.display(); // Output: 10 20 30 40 50

        System.out.println("Dequeued: " + cq.dequeue()); // Dequeues 10
        System.out.println("Dequeued: " + cq.dequeue()); // Dequeues 20
        cq.display(); // Output: 30 40 50

        // In a linear queue, this would fail. In a circular queue, it reuses space!
        cq.enqueue(60); 
        cq.enqueue(70);
        cq.display(); // Output: 30 40 50 60 70
    }
}
