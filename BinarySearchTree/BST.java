
import java.util.ArrayList;



@SuppressWarnings("unused")
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

     static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
     static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+">");
        inorder(root.right);
    }

     static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }

     static Node delete(Node root, int val){
        if(root.data<val){
            root.right=delete(root.right,val);
        }else if(root.data>val){
            root.left=delete(root.left,val);
        }else{
            //Case 1 - leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            //Case 2- One childe
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            //Case 3: two Children
            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }

    static void printInRange(Node root, int k1, int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+">");
            printInRange(root.right, k1, k2);
        }else if(root.data<k1){
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
        
    }

    static Node findInorderSuccessor(Node root) {
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    static void LeafPaths(Node root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.data);
        if(root.left==null && root.right==null){
            printPath(list);
        }
        LeafPaths(root.left,list);
        LeafPaths(root.right, list);
        list.remove(list.size()-1);
    }

    static boolean isValidBST(Node root, Node min, Node max){
        if(root==null){
            return true;
        }

        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }

    static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node left=mirror(root.left);
        Node right=mirror(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        // inorder(root);

        // if(search(root,7)){
        //     System.out.println("Found");
        // }else{
        //     System.out.println("Not Found");
        // }
        // root=delete(root,1);
        // System.out.println();
        // inorder(root);

        //printInRange(root, 5, 10);
        
        //LeafPaths(root, new ArrayList<>());

        if(isValidBST(root,null,null)){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
    }
}
