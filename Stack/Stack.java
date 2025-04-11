package Stack;

import java.util.ArrayList;

public class Stack {
    int top, cap;
    int[] a;

    public Stack(int cap) {
        this.cap = cap;
        top = -1;
        a = new int[cap];
    }

    public boolean push(int x) {
        if (top >= cap - 1) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is Empty");
            return 0;
        }
        return a[top--];
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is Empty");
            return 0;
        }
        return a[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    // public static void main(String[] args) {
    // Stack s = new Stack(5);
    // s.push(10);
    // s.push(20);
    // s.push(30);
    // System.out.println(s.pop() + " Popped from stack");
    // System.out.println(s.peek() + " Peeked from stack");
    // System.out.println("Top element is:" + s.peek());
    // System.out.println("Elements present in stack");
    // while (!s.isEmpty()) {
    // System.out.println(s.peek());
    // s.pop();
    // }
    // }
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        s.add(10);
        s.add(20);
        s.add(30);
        System.out.println(s.get(s.size() - 1) + " Popped from stack");
        s.remove(s.size() - 1);

        // Peek at the top element
        System.out.println("Top element is: " + s.get(s.size() - 1));

        // Print all elements in the stack
        System.out.print("Elements present in stack: ");
        while (!s.isEmpty()) {
            System.out.print(s.get(s.size() - 1) + " ");
            s.remove(s.size() - 1);
        }
    }
}
