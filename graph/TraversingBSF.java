import java.util.*;
import java.util.LinkedList;
public class TraversingBSF {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src,int dest,int wt){
            this.dest = dest;
            this.src = src;
            this.wt = wt;
        }

        public Edge add(int src,int dest,int wt){
            this.dest = dest;
            this.src = src;
            this.wt = wt;
            return this;
        }
    }
    tranverBSF

    public static void createGragh(ArrayList<Edge>[] graph){

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,1,1));
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));
        graph[6].add(new Edge(6,5,1));
    }
      
     public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);// source =0

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]){// visit curr
                System.out.print(curr+" ");
                vis[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
     }
     public static void traverse(ArrayList<Edge>[] graph){
        Queue<Integer> q = new Queue();
        boolean vis[] = new boolean[graph.length];

        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.println(curr+" ");
                vis[curr] =true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e  = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
     }
     public static void traverting(ArrayList<Edge>[] graph){

        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]){
                System.out.println(curr+" ");
                vis[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

     }

     public static boolean hasPath(ArrayList<Edge>[] graph,int  src,int dest,boolean vis[]){
         if(src==dest)return true;
         vis[src] = true;
         for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);

            if(!vis[e.dest] && hasPath(graph,e.dest,dest,vis)){
                return true;
            }
         }
        return false;
     }

     public static void dfs(ArrayList<Edge>[] graph,int curr,boolean vis[]){
        System.out.println(curr+" ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest]==false)
               dfs(graph,e.dest,vis);
        }
     }

     public static void dfs21(ArrayList<Edge>[] grapg, int curr,boolean vis[]){
        System.out.println(curr+" ");
        vis[curr] = true;

        for(int i=0; i<grapg[curr].size(); i++){
            Edge e = grapg[curr].get(i);
            if(!vis[e.dest]){
                dfs21(grapg,curr,vis);
            }
        }
     }

     public static void main(String[] args) {
        int v =7;
        ArrayList<Edge>[] graph = new ArrayList[v ];
        boolean[] vis = new boolean[v];
        createGragh(graph);
        bfs(graph);
        dfs(graph,0,vis);
     }
}
