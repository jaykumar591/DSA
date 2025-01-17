import java.util.*;
import java.util.LinkedList;

public class ThreeSum {
    public static List<List<Integer>> findThreeSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();

        if (arr == null || arr.length < 3) {
            return result; 
        }

       
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                   
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    
                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }

                   
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Increase sum
                } else {
                    right--; // Decrease sum
                }
            }
        }

        return result;
    }

    public void findThreeSum(int arr[],int n){
        if(arr.length<3)return;

        List<List<Integer>> list = new LinkedList();

        
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = findThreeSum(arr);

        System.out.println("Triplets that sum to 0: " + triplets);
    }
}
