import java.util.*;
public class Graphs {
    static class Edge{
        @SuppressWarnings("unused")
        int src;
        int dest;
        @SuppressWarnings("unused")
        int weight;

        Edge(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }

    private static void bfs(ArrayList<Edge>[] graph){
        boolean[] vis=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                bfsUtil(graph,vis);
            }
        }
    }

    private static void bfsUtil(ArrayList<Edge>[] graph,boolean vis[]){ //O(n)
        Queue<Integer> q=new LinkedList<>();
        //boolean vis[]=new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);// src,dest,wt
                    q.add(e.dest);
                }
            }
        }
    }

    private static void dfs(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            dfsUtil(graph,i,vis);
        }
    }
    private static void dfsUtil(ArrayList<Edge>[] graph,int curr,boolean vis[]){ //O(V+E)
        System.out.print(curr+" ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph,e.dest,vis);
            }
        }
    }

    private static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest,boolean[] vis){
        if(src==dest){
            return true;
        }
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }

    private static void printAllpath(ArrayList<Edge>[] graph,int src,int dest,String path){
        if(src==dest){
            System.out.println(path+dest);
            return;
        }
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            printAllpath(graph, e.dest, dest, path+src);
        }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }

        //0-vertex
        graph[0].add(new Edge(0,1,5));

        //1 vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        //2 vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));

        //3 vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        // 4 vertex
        graph[4].add(new Edge(4,2,2));

        // To find neighbour of any node
        /**for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);// src,dest,wt
            System.out.println(e.dest);
        }**/
        //bfs(graph);
        //dfs(graph,0,new boolean[V]);

        System.out.println(hasPath(graph,0,4,new boolean[V]));
    }
}
