package hashing;
import java.util.*;
public class UseTreeHashSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(23);
        set.add(12);
        set.add(345);
        set.add(123);
        set.add(54);
        set.add(13);
        System.out.println(set);

        Object obj[] =  set.toArray();
        Iterator it = set.iterator();
        for(Object o : obj)System.out.println(o);
        while(it.hasNext())System.out.println(it.next());
        for(Integer i : set) System.out.println(i);
    }
}
