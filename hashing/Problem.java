package hashing;

import java.util.*;

public class Problem {
    // public ArrayList<Integer> mejorityElement(int arr[]){
    //     // n/3 times
    //     HashMap<Integer , Integer> map = new HashMap<>();
    //     for(int i=0; i<arr.length; i++){

    //         int num = arr[i];

    //         if(map.get(num)>0){
    //             int count = map.get(num);
    //             count++;
    //             map.put(num,count);
    //         }
    //         else{
    //             map.put(num,1);
    //         }
    //     }

    //     Set<Integer> set = map.keySet();
    //     int n= arr.length;
    //     int n3 = n/3;
    //     ArrayList<Integer> list = new ArrayList<>();
    //     for(Integer i : set){
    //         int value = map.get(i);
    //         if(value>n3){
    //            list.add(i); 
    //         }
    //     }

    //     return list;
    // } 

    public void mejorityElement(int[] arr){
             // element   count 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr)
             map.put(i,map.getOrDefault(i,0)+1);
        for(Integer key : map.keySet())
            if(map.get(key)>arr.length/2)
               System.out.println(key);
    }

    public boolean isValidAnagram(String str1, String str2){
        if(str1.length()!=str2.length())return false;
        TreeMap<Character, Integer> map1 = new TreeMap<>();
        TreeMap<Character, Integer> map2 = new TreeMap<>();
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        for(char ch : ch1)
           map1.put(ch,map1.getOrDefault(ch,0)+1);
        for(char ch : ch2)
           map2.put(ch,map2.getOrDefault(ch,0)+1);

        
        

        return  map1.equals(map2);
    }

    public int countDistinctElement(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr)set.add(i);
        return set.size();
    }

    public void getAllUniqueElementInArray(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        Set<Integer> keys = map.keySet();

        ArrayList<Integer> list = new ArrayList<>();
        for(int key : keys){
            if(map.get(key)==1){
               list.add(key);
            }
        }
        System.out.println(list);
    }
    public void findUnion(int set1[],int set2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i : set1) set.add(i);
        for(int i : set2) set.add(i);
        System.out.println(set);
    }
    public void findIntersection(int set1[],int set2[]){
        if(set1.length==0 || set2.length==0){
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i : set1) set.add(i);

        ArrayList<Integer> list =  new ArrayList<>();
        for(int i : set2)
           if(set.contains(i)) list.add(i);

        System.out.println(list);


    }
    public static String getStart(HashMap<String,String> titket){

        HashMap<String,String> revMap = new HashMap<>();

        for(String i : titket.keySet()){
            revMap.put(titket.get(i),i);
        }

        for(String  i : titket.keySet()){
            if(!revMap.containsKey(i)){
                return i;
            }
        }
        return null;
    }
    
    public static int largestSubArray(int arr[]){

        int largest =0;
        for(int i=0; i<arr.length; i++){
            int sum =0;

            for(int j=i; j<arr.length; j++){
                sum +=arr[j];
                if(sum==0){
                    largest = Math.max(largest,j-i+1);

                }
            }
        }
        return largest;
    }
    public static void largestSubArray1(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum=0;
        int len=0;

        for(int j=0; j<arr.length; j++){
            sum +=arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len,j-map.get(sum));
            }
            else{
                map.put(sum,j);
            }
        }

        System.out.println("largest sum of sub array: "+len);
    }

    public void countSumEqaulsToK(int arr[],int k){
        HashMap<Integer , Integer> map = new HashMap<>();

        map.put(0,1);

        int sum =0;
        int ans =0;

        for(int j=0; j<arr.length; j++){
            sum +=arr[j];

            if(map.containsKey(sum)){
                ans += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7};
        largestSubArray1(arr);
    }



}
