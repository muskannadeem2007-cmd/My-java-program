
import java.util.Scanner;

public class StackArray {

    static int size = 5;
    static int[] stack = new int[size];
    static int top = -1;

    // Push: Insert an element
    static void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is Full!");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " inserted into stack.");
        }
    }

    // Pop: Remove the top element
    static void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.println("Removed element: " + stack[top]);
            top--;
        }
    }

    // Peek: Show the top element
    static void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    // Display: Show all elements
    static void display() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    push(value);
                    break;

                case 2:
                    pop();
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
}
```
