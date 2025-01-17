package graph;
import java.util.*;

public class Main {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.dest = dest;
            this.src = src;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {
        /*  
               (5) 
             0------ 1    
                    / \  
                (1)/   \ (3) 
                  /     \ 
                 /       \ 
                2 -------- 3 
                |     (1)
             (2)| 
                |
                4   
        */
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 -vertex
        graph[0].add(new Edge(0, 1, 5));
        // 1 -vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        // 2 -vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        // 3 -vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        // 4 -vertex
        graph[4].add(new Edge(4, 2, 2));

        int idx = 0;
        for (ArrayList<Edge> list : graph) {
            System.out.println(idx);
            System.out.println("All neighbors:");
            for (Edge edge : list) {
                System.out.print(edge.dest + " ");
            }
            System.out.println();
            idx++;
        }
    }
}
