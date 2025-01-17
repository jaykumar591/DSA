package problem;

import java.util.LinkedHashMap;
import java.util.*;

public class ProblemByFriends {

    public static int getResult(int arr[],int k){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>=k)return i;
        }
        return -1;
    }
    public static int check(int arr[], int k , int temp[],int i){
        if(i>=arr.length){
            return -1;
        }
        temp[arr[i]]++;
        if(temp[arr[i]]>=k){
            return arr[i];
        }
        i++;
        return check(arr,k,temp,i);
    }
    public static int getResult1(int arr[], int k){

        return check(arr,k,new int[200] ,0);
    }
    public int getResultUsingArray(int arr[],int k){
        int temp[] = new int[200];
        for(int i : arr){
            temp[i]++;
            if(temp[i]>=k){
                return temp[i];
            }
        }
        return -1;
    }

    public static void enjoyCode(){
        Scanner sc = new Scanner(System.in);

        int integer = sc.nextInt();
        double decimaValue = sc.nextDouble();
        sc.nextLine();
        String string = sc.nextLine();
        

        System.out.println(string);
        System.out.println(decimaValue);
        System.out.println(integer);
    }
    public static void main(String[] args) {
       enjoyCode();
    }
}
