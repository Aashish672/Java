import java.util.*;
public class KruskalAlgorithm {
    static class Edge implements Comparable<Edge>{

        // Edge class
        int src,dest,wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }

        // For sorting edges by weight
        @Override
        public int compareTo(Edge e){
            return this.wt-e.wt;
        }
    }

    // Disjoint Set (Union-Find)
    static int[] parent;
    static int[] rank;

    private static void init(int n){
        parent=new int[n];
        rank=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;  // each node is its own parent
            rank[i]=0;
        }
    }

    public static int find(int x){
        if(x!=parent[x]){
            parent[x]=find(parent[x]);   // Path compression
        }
        return parent[x];
    }

    public static void union(int a,int b){
        int rootA=find(a);
        int rootB=find(b);

        if(rootA!=rootB){
            if(rank[rootA]<rank[rootB]){
                parent[rootA]=rootB;
            }else if(rank[rootA]>rank[rootB]){
                parent[rootB]=rootA;
            }else{
                parent[rootB]=rootA;
                rank[rootA]++;
            }
        }
    }

    // Kruskal's MST
    private static int kruskalMST(int n,ArrayList<Edge> edges){
        Collections.sort(edges); // Step 1: sort edges by weight

        init(n); // initialize DSU

        int mstCost=0;
        int edgesUsed=0;

        for(Edge e:edges){

            // Check if src and dest belong to different sets
            if(find(e.src) != find(e.dest)){
                union(e.src,e.dest);
                mstCost+=e.wt;
                edgesUsed++;

                if(edgesUsed==n-1) break; // MST has n-1 edges
            }
        }

        return mstCost;
    }

    public static void main(String[] args) {
        int n=4; // number of vertices
        ArrayList<Edge> edges=new ArrayList<>();

        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,6));
        edges.add(new Edge(0,3,5));
        edges.add(new Edge(1,3,15));
        edges.add(new Edge(2,3,4));

        int mstCost=kruskalMST(n, edges);
        System.out.println(mstCost);
    }
}
