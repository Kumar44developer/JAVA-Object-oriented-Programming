import java.util.*;

class Stack {
    private static final int MAX_SIZE = 3;
    private int[] stackArray;
    private int top;

    public Stack() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int value) {
        if (top == (MAX_SIZE - 1)) {
            System.out.println("Stack full");
            return;
        }
        stackArray[++top] = value;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack empty");
            return;
        }
        System.out.println("TOS is " + stackArray[top--]);
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack empty");
            return;
        }
        System.out.println("Contents of stack are");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}

public class Stack_simulation {
    public static void main(String[] args) {
        Stack st = new Stack();
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element to insert: ");
                    ch = sc.nextInt();
                    st.push(ch);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}



