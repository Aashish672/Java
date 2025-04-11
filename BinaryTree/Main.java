package BinaryTree;

//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // BinaryTree binaryTree = new BinaryTree();
        // binaryTree.populate(scanner);
        // binaryTree.display();
        // scanner.close();
        BST tree = new BST();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        tree.populate(nums);
        tree.display();
        System.out.println("Balanced: " + tree.balanced());

    }
}
