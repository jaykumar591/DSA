package graph1;
import java.util.*;

public class Graph {
   public static class Edge{
        int src;
        int dest;

        public  Edge(int src,int dest){
            this.dest = dest;
            this.src = src;
        }
    }

    public static void bfs(ArrayList<Edge> graph[], int v){
        Queue<Integer> q = new LinkedList<>();

        boolean vis[] = new boolean[v];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();

            if(vis[curr]==false){

                System.out.println(curr+" ");
                vis[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e =  graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr,boolean vis[]){
        System.out.println(curr+" ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest]==false)
                 dfs(graph,e.dest,vis);
        }
    }

    public static void printAllPath(ArrayList<Edge> graph[], boolean vis[],int curr,String path,int tar){
        if(curr==tar){
            System.out.print(path+" ");
            return;
        }

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr] = true;
                printAllPath(graph,vis,e.dest,path+e.dest,tar);
                vis[curr] = false;
            }
        }
    }

    public static boolean isCycleDirected(ArrayList<Edge> graph[] ,boolean vis[], int curr,boolean rec[] ){
        vis[curr] = true;
        rec[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = new graph[curr].get(i);

            if(rec[e.dest]){
                return true;
            }else if (!vis[e.dest]){
                if(isCycleDirected(graph,vis,e.dest,rec)){
                    return true;
                }
            }
        }

        rec[curr] = false;
        return false;
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
        

    }

    public static void main(String[] args) {
        int v =7;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        int src=0,tar=3;
        printAllPath(graph,new boolean[v], src,"0",tar);
    }
}
