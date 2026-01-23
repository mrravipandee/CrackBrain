package StackDS;

public class Easy {

    int[] arr;
    int top;
    int size;

    Easy(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // push function
    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return arr[top];
    }

    public static void main(String[] args) {
        Easy stack = new Easy(5);

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println(stack.peek()); // 15 [peek use for saw last value of stack]

        System.out.println(stack.pop()); // remove last element // 15

        System.out.println(stack.peek()); // 10
    }
}
