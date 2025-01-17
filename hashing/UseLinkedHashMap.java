package hashing;
import java.util.*;

public class UseLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        lhm.put("a",10);
        lhm.put("b",100);
        lhm.put("c",123);
        lhm.put("d",3908);
        System.out.println(lhm);
    }
}
