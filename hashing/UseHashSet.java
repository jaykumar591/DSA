package hashing;
import java.util.*;;
public class UseHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        Object arr[] = set.toArray();

        // Iterator it = set.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for(Object i : arr){
            System.out.println(i);
        
        }
    }
}
