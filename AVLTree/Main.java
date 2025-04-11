package AVLTree;
public class Main {
    public static void main(String[] args) {
        AVL tree = new AVL();
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }
        System.out.println("Height of the tree: " + tree.height());
        // System.out.println("Number of nodes in the tree: " +
        // tree.countNodes(tree.root));
    }
}
