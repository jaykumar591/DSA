import java.util.*;

public class MaxHeap {
    class Heap{
        ArrayList<Integer> arr = new ArrayList<>();


        public void add(int data){
            arr.add(data);
            

            // fix 
            int x = arr.size()-1;
            int parent = (x-1)/2;

            while(arr.get(x) > arr.get(parent)){
                int temp = arr.get(x);
                arr.set(x,arr.get(parent));
                arr.set(parent, temp);
                x = parent;
                parent = (x-1)/2;

            }

        }
        public int peak(){return arr.get(0);}

        public void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx =i;

            if(left<arr.size() && arr.get(left)>arr.get(minIdx)){
                minIdx = left;
            }

            if(right<arr.size() && arr.get(right)>arr.get(minIdx)){
                minIdx = right;
            }

            if(minIdx!=i){
                // swap
                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);

            heapify(minIdx);
            }
        }
        public int remove(){
            int data = arr.remove(0);

            // swap first and last
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            // delete last
            arr.remove(arr.size()-1);
            heapify(0);
            return data;
    
        }
    }

}
