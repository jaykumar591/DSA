package hashing;

// import java.util.HashMap;
import java.util.*;

public class Practice {
      // apear n/4 times
    public void mojorityEleement(int arr[]){
        if(arr.length<0)return;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        int times = arr.length/3;

        for(Integer i : map.keySet()){
            if(map.get(i)>=times){
                list.add(i);
            }

        }
        System.out.println(list) ;
    }

    public boolean isValidAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){

            return false;
        }
        TreeMap<Character,Integer> countStr1 = new TreeMap<>((a,b)->a-b);
        TreeMap<Character,Integer> countStr2 = new TreeMap<>((a,b)->a-b);
        for(char ch : str1.toCharArray()){
            countStr1.put(ch,countStr1.getOrDefault(ch,0)+1);
        }
        for(char ch : str2.toCharArray()){
            countStr2.put(ch,countStr2.getOrDefault(ch,0)+1);
        }

        return countStr1.equals(countStr2);

    }
    public void union(int arr1[], int arr2[]){
        HashSet<Integer> union = new HashSet<>(100);
        for(int i : arr1) union.add(i);
        for(int i : arr2) union.add(i);

        System.out.println("Union of two sets is : "+union);
    }
    public void inserSection(int arr1[],int arr2[]){
        HashSet<Integer> set1 = new HashSet<>();
        for(int i : arr1) set1.add(i);
        HashSet<Integer> result = new HashSet<>();
        for(int i : arr2){
            if(set1.contains(i)){
                result.add(i);
            }
        }

        System.out.println("InterSaction of two sets is : "+result);
    }
    public String getStart(HashMap<String,String> map){
        HashMap<String,String> revMap = new HashMap<>();

        for(String key : map.keySet()){
            revMap.put(map.get(key),key);
        }

        for(String key : map.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return ""; 
    }
    public void fromToTicket(HashMap<String,String> tickets){
        String start = getStart(tickets);
        System.out.println(start);
        for(String key : tickets.keySet()){
            System.out.println(" -> "+tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println("");
    }

    public int longestLenWithZeroSum(int arr[]){

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;
        int len = 0;
        for(int j=0; j<arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len,j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        
    }
}
