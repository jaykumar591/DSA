import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Enjoy {
    static class Edge {
        int dest;
        int src;
        int wt;
        public Edge(int dest,int src,int wt){
            this.dest=dest;
            this.src = src;
            this.wt = wt;
        }

        
    }
    public static void main(String[] args) {
        List<Edge> list = new ArrayList<>();

        list.add(new Edge(0,1,0));
        list.add(new Edge(1,2,0));
        list.add(new Edge(1,3,0));
        list.add(new Edge(2,1,0));
        list.add(new Edge(2,3,0));
        list.add(new Edge(3,2,0));
        list.add(new Edge(3,1,0));

        for(Edge e : list){
            System.out.println(e.dest);
        }
        

    }
}
