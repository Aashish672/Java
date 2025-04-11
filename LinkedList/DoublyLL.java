package LinkedList;

public class DoublyLL {
    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        node.prev = temp;
        if (temp.next != null) {
            temp.next.prev = node;
        }
        temp.next = node;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.value + "->");
            last = node;
            node = node.next;
        }
        System.out.println("End");
        System.out.println("Linked List in reverse order");
        while (last != null) {
            System.out.print(last.value + "->");
            last = last.prev;
        }
        System.out.println("Last");
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node next, Node prev) {
        // this.value = value;
        // this.next = next;
        // this.prev = prev;
        // }
    }
}
