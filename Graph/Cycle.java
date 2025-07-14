import java.util.*;
public class Cycle {
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        /**graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));**/
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,4));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,2));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,4));
    }
    public static boolean isCycleDirected(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[]){
        vis[curr]=true;
        rec[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            }else if(!vis[e.dest]){
                if (isCycleDirected(graph, vis, e.dest, rec)) {
                return true;
                }
            }
        }
        rec[curr]=false;
        return false;
    }

    public static boolean isCycleUndirected(ArrayList<Edge> graph[],boolean vis[],int curr,int par){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest] && e.dest!=par){
                return true;
            }else if(!vis[e.dest]){
                if(isCycleUndirected(graph, vis, e.dest, curr)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        /**boolean vis[]=new boolean[V];
        boolean rec[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                boolean isCycle=isCycleDirected(graph, vis, 0, rec);
                if(isCycle){
                    System.out.println(isCycle);
                    break;
                }
            }
        }
        //System.out.println(isCycleDirected(graph, new boolean[V], 0, new boolean[V]));**/

        System.out.println(isCycleUndirected(graph,new boolean[V], 0, -1));
    }
}
