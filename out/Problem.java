package out;

import java.util.*;


public class Problem {
    public static List<Integer> maximumSlidingWindows(int arr[], int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length - k+1; i++) {
            PriorityQueue<Integer> sub = new PriorityQueue<>((a, b) -> b - a);

            for (int j = i; j < i + k; j++) {
                sub.add(arr[j]);
            }
            list.add(sub.remove());
        }

        return list;
    }

    public static void main(String[] args) {
      int hash = "HH".hashCode();
      int hash1 = "HH".hashCode();
    

      System.out.println(hash+" : "+hash1);
    }
}
