package greedy;
import java.util.*;

public class JobSelections {


    public static void main(String[] args) {
         int start[] = {1,3,0,5,8,5};
         int end[] = {2,4,6,7,9,9}; // most be sorted

         int maxAct = 0;
         int lastEnd = end[0];

         ArrayList<Integer> list = new ArrayList<>();
         list.add(0);
         for (int i = 1; i < end.length; i++) {
            if(start[i]>=lastEnd){
                maxAct++;
                lastEnd = end[i];
                list.add(i);
            }
         }
    }
}
