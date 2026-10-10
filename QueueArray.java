
import java.util.Scanner;

public class QueueArray {
    static int size = 5;
    static int[] queue = new int[size];
    static int front = -1;
    static int rear = -1;

    // Enqueue: Insert an element
    static void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is Full!");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = value;
            System.out.println(value + " inserted into queue.");
        }
    }

    // Dequeue: Remove an element
    static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Removed element: " + queue[front]);
            front++;
        }

        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }

    // Peek: Show the front element
    static void peek() {
        if (front == -1) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    // Display: Show all elements
    static void display() {
        if (front == -1) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    enqueue(value);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);

        sc.close();
    }


