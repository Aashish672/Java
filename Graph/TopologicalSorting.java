import java.util.*;
public class TopologicalSorting{
    public static void main(String[] args){
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        //topSort(graph, V);

        topSortBFS(graph);
        
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void topSortUtil(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> stack){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            if(!vis[e.dest]){
                topSortUtil(graph,e.dest,vis,stack);
            }
        }
        stack.push(curr);
    }

    public static void topSort(ArrayList<Edge> graph[],int V){
        boolean vis[]=new boolean[V];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<V;i++){
            if(!vis[i]){
                topSortUtil(graph, i,vis,stack); // Modified DFS 
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    private static void calcIndeg(ArrayList<Edge> graph[],int indeg[]){
        for(int i=0;i<graph.length;i++){
            int vertex=i;
            for(int j=0;j<graph[vertex].size();j++){
                Edge e=graph[vertex].get(j);
                indeg[e.dest]++;
            }
        }
    }

    private static void topSortBFS(ArrayList<Edge> graph[]){
        int indeg[]=new int[graph.length];
        calcIndeg(graph, indeg);
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        //bfs
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr +" ");

            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
}