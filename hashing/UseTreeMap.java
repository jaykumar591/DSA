package hashing;
import java.util.*;

public class UseTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tmap = new TreeMap<>();
        tmap.put("d",33);
        tmap.put("c",12);
        tmap.put("b",42);
        tmap.put("a",13);
        System.out.println(tmap);
    }
}
