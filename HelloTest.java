import java.util.Arrays;

public class HelloTest {
    
    public static boolean checkPath(int[][] edges , int n,int src,int dest){
        
        boolean graph[][] = new boolean[n][n];

        for(boolean[] row : graph){
            Arrays.fill(row,false);
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            graph[u][v] = true;
            graph[v][u] = true;
        }
        boolean[] vis = new boolean[n];

        return dfs(graph,src,dest,vis,n);
    }

    public static boolean dfs(boolean[][] graph, int src,int dest,boolean[] vis,int n){
        if(src==dest)return true;

        vis[src] = true;

        for(int i=0; i<n; i++){
            if(graph[src][i] && vis[src]){

                if(dfs(graph,i,dest,vis,n)){
                    return true;
                }
            }

        }
        return false;
    }
}
