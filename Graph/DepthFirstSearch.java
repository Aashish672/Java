import java.util.*;

public class DepthFirstSearch {
    //O(V+E)
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false){
                dfs(graph,e.dest,vis);
            }
            
        }
    }
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        BreadthFirstSearch.createGraph(graph);
        boolean vis[]=new boolean[V];

        dfs(graph, 0, vis);
        System.out.println();
    }
}
