package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void bubbleSort() {
        if (head == null || head.next == null)
            return;
        boolean swapped;
        Node ptr1;
        Node lptr = null;

        do {
            swapped = false;
            ptr1 = head;

            while (ptr1.next != lptr) {
                if (ptr1.data > ptr1.next.data) {
                    int temp = ptr1.data;
                    ptr1.data = ptr1.next.data;
                    ptr1.next.data = temp;
                    swapped = true;
                }
                ptr1 = ptr1.next;
            }
            lptr = ptr1;
        } while (swapped);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Sort {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(5);

        System.out.println("Original list:");
        list.printList();

        list.bubbleSort();

        System.out.println("Sorted list:");
        list.printList();
    }
}
