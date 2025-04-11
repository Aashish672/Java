package Stack;

import java.util.*;
import java.util.Stack;

public class Queue {
    static class QueueNode {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void enqueue(int x) {
            while (!s1.empty()) {
                s2.push(s1.peek());
                s1.pop();
            }
            s1.push(x);
            while (!s2.empty()) {
                s1.push(s2.peek());
                s2.pop();
            }
        }

        int dequeue() {
            if (s1.empty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = s1.peek();
            s1.pop();
            return x;
        }

        boolean isEmpty() {
            return s1.empty();
        }
    }

    public static void main(String[] args) {
        QueueNode q = new QueueNode();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
    }
}
