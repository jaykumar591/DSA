import java.util.ArrayList;




public class Vertex{

    private String data;
    private ArrayList<Edge> edges;
    
    public Vertex(String inputData){
        this.data = inputData;
        this.edges = new ArrayList<>();

    }
}