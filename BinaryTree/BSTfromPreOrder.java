import java.util.Stack;

import javax.swing.tree.TreeNode;

public class BSTfromPreOrder {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        for (int i = 1; i < preorder.length; i++) {
            TreeNode node = new TreeNode(preorder[i]);
            if (node.val < st.peek().val) {
                st.peek().left = node;
            } else {
                TreeNode parent = null;
                while (!st.isEmpty() && st.peek().val < node.val) {
                    parent = st.pop();
                }
                parent.right = node;
            }
            st.push(node);
        }

        return root;
    }
}
