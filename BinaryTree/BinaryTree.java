package BinaryTree;

import java.util.*;

public class BinaryTree {
    public BinaryTree() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Insert Elements
    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of" + node.value + "?");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left node of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter right of" + node.value + "?");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right node of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root);
    }

    private void display(Node node) {
        if (node == null) {
            return;
        }
        String str = "";
        if (node.left != null) {
            str += node.left.value;
        }
        str += "->" + node.value + "<-";
        if (node.right != null) {
            str += node.right.value;
        }
        System.out.println(str);
        display(node.left);
        display(node.right);
    }

    public void preetyDisplay() {
        preetyDisplay(root, 0);
    }

    private void preetyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        preetyDisplay(node.right, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(node.value);
        preetyDisplay(node.left, level + 1);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        tree.preetyDisplay();
    }
}