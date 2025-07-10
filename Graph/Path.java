import java.util.*;
public class Path {
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        BreadthFirstSearch.createGraph(graph);

        int src=0,tar=5;
        printAllPath(graph, new boolean[V], src, "0", tar);
    }
    //O(V^V)
    public static void printAllPath(ArrayList<Edge> graph[],boolean vis[],int curr,String path,int tar){
        if(curr==tar){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr]=true;
                printAllPath(graph, vis, e.dest, path+e.dest, tar);
                vis[curr]=false;
            }
        }
    }
}
