import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BuildTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(idx>=nodes.length || nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }

        public void preOrder(Node root){// Time Complexity O(n)
            if(root==null){
                return;
            }
            System.out.print(root.data+"->");
            preOrder(root.left);
            preOrder(root.right);
        }

        public void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+"->");
            inOrder(root.right);
        }

        public void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"->");
        }

        //Level Order traversal
        public void levelOrder(Node root){
             if(root==null){
                return;
             }
             Queue<Node> q=new LinkedList<>();
             q.add(root);
             q.add(null);
             while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+"->");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
             }
        }

        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }

        public int Count(Node root){//O(N)
            if (root==null){
                return 0;
            }
            int leftCount=Count(root.left);
            int rightCount=Count(root.right);
            return leftCount+rightCount+1;
        }

        public int Sum(Node root){//O(n)
            if(root==null){
                return 0;
            }
            int left=Sum(root.left);
            int right=Sum(root.right);
            return left+right+root.data;
        }

        public int diameter1(Node root){ // O(n^2)
            if(root==null){
                return 0;
            }
            int leftDiam=diameter1(root.left);
            int leftht=height(root.left);
            int rightDiam=diameter1(root.right);
            int rightht=height(root.right);

            int selfDiam=leftht+rightht+1;
            return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
        }

        static class Info{
            int diam;
            int ht;

            public Info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;
            }
        }

        public Info diameter2(Node root){ //O(n)
            if(root==null){
                return new Info(0,0);
            }
            Info leftInfo=diameter2(root.left);
            Info rightInfo=diameter2(root.right);

            int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
            int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

            return new Info(diam,ht);
        }

        static class View{
            Node node;
            int hd;

            public View(Node node, int hd){
                this.node=node;
                this.hd=hd;
            }
        }

        public void topView(Node root){
            Queue<View> q=new LinkedList<>();
            HashMap<Integer,Node> map=new HashMap<>();

            int min=0,max=0;
            q.add(new View(root,0));
            q.add(null);

            while(!q.isEmpty()){
                View curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }

                if(curr.node.left!=null){
                    q.add(new View(curr.node.left,curr.hd-1));
                    min=Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new View(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
                }
            }

            for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data+" ");
            }
        }

        public void KLevel(Node root,int level,int k){
            if(root==null){
                return;
            }

            if(level==k){
                System.out.print(root.data+" ");
                return;
            }
            KLevel(root.left,level+1,k);
            KLevel(root.right, level+1, k);
        }

        public static boolean getPath(Node root,int n, ArrayList<Node> path){
            if(root==null){
                return false;
            }
            path.add(root);

            if(root.data==n){
                return true;
            }
            boolean foundLeft=getPath(root.left,n,path);
            boolean foundRight=getPath(root.right,n,path);

            if(foundLeft || foundRight){
                return true;
            }
            path.remove(path.size()-1);
            return false;
        }
        public Node lca(Node root,int n1,int n2){
            ArrayList<Node> path1=new ArrayList<>();
            ArrayList<Node> path2=new ArrayList<>();

            getPath(root,n1,path1);
            getPath(root,n2,path2);

            int i=0;
            for(;i<path1.size() && i<path2.size();i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
            }
            Node lca=path1.get(i-1);
            return lca;
        }
        public Node lca2(Node root,int n1,int n2){
            if(root==null){
                return null;
            }
            if(root.data==n1 || root.data==n2 ){
                return root;
            }
            Node left=lca2(root.left,n1,n2);
            Node right=lca2(root.right,n1,n2);
            if(left==null){return right;}
            if(right==null){return left;}

            return root;
        }

        public int minDist(Node root,int n1,int n2){
            Node lcaNode=lca2(root,n1,n2);
            int dist1=lcaDist(lcaNode,n1);
            int dist2=lcaDist(lcaNode,n2);

            return dist1+dist2;
        }

        public static int lcaDist(Node root,int n){
            if(root==null){
                return -1;
            }
            if(root.data==n){return 0;}

            int left=lcaDist(root.left, n);
            int right=lcaDist(root.right, n);

            if(left==-1 && right==-1){return -1;}
            if(left==-1){return right+1;}
            else{return left+1;}
        }

        public int Kancestor(Node root,int n,int k){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }
            int leftDist=Kancestor(root.left, n, k);
            int rightDist=Kancestor(root.right, n, k);

            if(leftDist==-1 && rightDist==-1){
                return -1;
            }
            int max=Math.max(leftDist,rightDist);
            if(max+1==k){
                System.out.println(root.data);
            }
            return max+1;
        }

        public int SumTree(Node root){
            if(root==null){
                return 0;
            }
            int left=SumTree(root.left);
            int right=SumTree(root.right);
            int data=root.data;
            int newLeft=root.left==null?0:root.left.data;
            int newRight=root.right==null?0:root.right.data;
            root.data=newLeft+left+newRight+right;
            return data;
        }
    }

    public static void main(String[] args) {
        //int nodes[]={1,2,4,-1,-1,-1,3,5,-1,-1,6,-1,-1};
        
        //Node root=BT.BuildTree.buildTree(nodes);
        BuildTree Tree=new BuildTree();
        // Tree.preOrder(root);
        // System.out.println();
        // Tree.inOrder(root);
        // System.out.println();
        // Tree.postOrder(root);
        // System.out.println();
        // Tree.levelOrder(root);
        // System.out.println();
        // System.out.println(Tree.height(root));
        // System.out.println(Tree.Count(root));
        // System.out.println(Tree.Sum(root));
        //System.out.println(root.data);
        //System.out.println(Tree.diameter2(root).diam);

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        //Tree.topView(root);
        // int k=2;
        // Tree.KLevel(root,1,k);
        //int n1=4,n2=7;
        //System.out.println(Tree.lca2(root, n1, n2).data);
        //System.out.println(Tree.Kancestor(root, 5, 2    ));
        Tree.SumTree(root);
        Tree.preOrder(root);
    }
}
