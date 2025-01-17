package hashing;
import java.util.*;

public class UseLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);

        Object arr[] = set.toArray();
        Iterator it = set.iterator();
        for(Object i : arr){
            System.out.println(i);
        }
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(Integer i : set)System.out.println(i);
    }
}
