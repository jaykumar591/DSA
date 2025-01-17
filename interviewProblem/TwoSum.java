import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    public static void twoSub(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int sno = target - arr[i];
            if (map.containsKey(sno)) {
                ans[0] = map.get(sno); 
                ans[1] = i;           
                System.out.println("Indices: " + Arrays.toString(ans));
                return; 
            }
            map.put(arr[i], i);
        }
        System.out.println("No pair found");
    }

    public static void twoSub(int arr[], int target,int n){
        if(n<2)return;

        HashMap<Integer,Integer> list = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0; i<n; i++){
            int sub = target-arr[i];
            if(list.containsKey(sub)){
                ans[0] = list.get(sub);
                ans[1] = i;
                System.out.println("Indices"+ Arrays.toString(ans));
            }
            list.put(arr[i],i);

        }
        System.out.println("No pair found");
    }



    public static void main(String[] args) {
        int arr[] = {11, 3, 7, 9, 14, 2};
        int target = 17;
        twoSub(arr, target);
    }
}
