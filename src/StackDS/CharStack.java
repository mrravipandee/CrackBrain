package StackDS;

public class CharStack {

    char[] charArray;
    int size;
    int top;

    CharStack(int size) {
        this.size = size;
        charArray = new char[size];
        top = -1;
    }

    void push(char data) {
        charArray[++top] = data;
    }

    char pop() {
        return charArray[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}
