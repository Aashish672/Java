import java.util.*;
@SuppressWarnings("unused")
public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
        }
    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST,int size,int min,int max){
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
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

    static Node sorted2balanNode(int[] arr,int start,int end){
        if(start>end){return null;}
        
        int mid=(start+end)/2;
        Node node=new Node(arr[mid]);
        node.left=sorted2balanNode(arr, start, mid-1);
        node.right=sorted2balanNode(arr, mid+1, end);
        return node;
    }

    static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    static Node createBST(ArrayList<Integer> inorder,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(inorder.get(mid));
        root.left=createBST(inorder, st, mid-1);
        root.right=createBST(inorder, mid+1, end);

        return root;
    }
    static Node BST2BalancedBST(Node root){
        //inorder seq
        ArrayList<Integer> list=new ArrayList<>();
        getInorder(root, list);
        root=createBST(list, 0, list.size()-1);
        return root;
    }

    static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }else if(max!=null && root.data>=max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    public static int maxBST=0;
static Info largestBST(Node root){
    if(root==null){
        return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    Info leftInfo = largestBST(root.left);
    Info rightInfo = largestBST(root.right);

    int size = leftInfo.size + rightInfo.size + 1;
    int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
    int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

    if(leftInfo.isBST && rightInfo.isBST && root.data > leftInfo.max && root.data < rightInfo.min){
        maxBST = Math.max(maxBST, size);
        return new Info(true, size, min, max);
    }

    return new Info(false, size, min, max);
}

static Node mergeBSts(Node root1,Node root2){
    ArrayList<Integer> arr1=new ArrayList<>();
    getInorder(root1, arr1);
    getInorder(root2,arr1);
    Collections.sort(arr1);
    return createBST(arr1, 0, arr1.size()-1);

}

    public static void main(String[] args) {
        // int[] arr={3,5,6,8,10,11,12};

        // System.out.println(sorted2balanNode(arr, 0, 6).data);

        // Node root=new Node(50);
        // root.left=new Node(30);
        // root.left.left=new Node(5);
        // root.left.right=new Node(20);

        // root.right=new Node(60);
        // root.right.left=new Node(45);
        // root.right.right=new Node(70);
        // root.right.right.left=new Node(65);
        // root.right.right.right=new Node(80);

        //System.out.println(BST2BalancedBST(root).right.data);

        //Info info=largestBST(root);
        //System.out.println("Largest BSt size="+maxBST);

        Node root1=new Node(9);
        root1.left=new Node(3);
        root1.right=new Node(4);

        Node root2=new Node(2);
        root2.left=new Node(1);
        root2.right=new Node(4);

        Node root=mergeBSts(root1, root2);

        System.out.println(root.data);
    }
}
