import java.util.*;

public class HeadDataStructre {
    static class Heap{
       static ArrayList<Integer> arr = new ArrayList<>();
        
        public static  void add(int data){
            arr.add(data);

            // check parent

            int x = arr.size()-1;
            int parent = (x-1)/2;

            while (arr.get(x)<arr.get(parent)) {
                int temp = arr.get(x);
                arr.set(x,arr.get(parent));
                arr.set(parent , temp);
                x = parent;
                parent = (x-2)/2;
            }

        }
        public static int peak(){
            if(arr.size()==0){
                return -1;
            }
            return arr.get(0);
        }
        public static void heappify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
                minIdx = left;
            }
            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                // swap

                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx , temp);

                heappify(minIdx);
            }
        }

        public int remove(){
            int data = arr.remove(0);

            // swap first and last
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step 2 delete last
            arr.remove(arr.size()-1);

            // fix heap
            heappify(0);
            return data;
        }
    }
}
