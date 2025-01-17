package array;

import java.util.Scanner;



public class Arrays  {
   
    int[]  inputArray(int n){

        int[] arr = new int[n];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    void  show(int[] arr){

        for(int i=0; i<arr.length; i++){

            if(arr.length-2<=i)
                 System.out.print("{"+arr[i]+", ");
            else System.out.print(arr[i]+"}");
        }
    }

    // linear search technique
    boolean linearSearch(int[] arr , int key){
        
        for(int i: arr) if(key==i) return true;return false;
    }
    boolean linearSearch(byte[] arr , byte key){
        
        for(byte i: arr) if(key==i) return true;return false;
    }
    boolean linearSearch(short[] arr , short key){
        
        for(short i: arr) if(key==i) return true;return false;
    }
    boolean linearSearch(int[] arr , long key){
        
        for(int i: arr) if(key==i) return true;return false;
    }
    boolean linearSearch(long[] arr , long key){
        
        for(long i: arr) if(key==i) return true;return false;
    }
    boolean linearSearch(long[] arr , int key){
        
        for(long i: arr) if(key==i) return true;return false;
    }
    boolean linearSearch(char[] arr ,char key){

        for(char i : arr) if(i==key) return true;return false;
    }
    boolean linearSearch(String str ,char ch){

        for(char i : str.toCharArray())if(i==ch) return true;return false;
    }
    boolean linearSearch(String[] arr , String key){

        for(String i : arr)if(i.equals(key))return true; return false;
    }

    //Binary search technique

    boolean binarySearch(short[] arr, short key){

        int start =0;
        int end = arr.length-1;

        while(start<=end){

            int mid = (start+end)/2;

            if(arr[mid]==key){
                return true;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
    boolean binarySearch(byte[] arr, byte key){

        int start =0;
        int end = arr.length-1;

        while(start<=end){

            int mid = (start+end)/2;

            if(arr[mid]==key){
                return true;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
    boolean binarySearch(int[] arr, int key){

        int start =0;
        int end = arr.length-1;

        while(start<=end){

            int mid = (start+end)/2;

            if(arr[mid]==key){
                return true;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
    boolean binarySearch(char[] arr, char key){

        int start =0;
        int end = arr.length-1;

        while(start<=end){

            int mid = (start+end)/2;

            if(arr[mid]==key){
                return true;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
    boolean binarySearch(String[] arr, String key){

        int start =0;
        int end = arr.length-1;

        while(start<=end){

            int mid = (start+end)/2;

            if(arr[mid].equals(key)){
                return true;
            }
            else if(arr[mid].compareTo(key)>1){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }

    void bubbleSort(int[] arr){

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; ){

                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void selectionSort(int[] arr){

        for(int i=0; i<arr.length; i++){
            
            int minPos = i;

            for(int j=i+1; j<arr.length-1; j++){

                if(arr[i]> arr[j]){
                    minPos =j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;

        }
    }

    void insertionSort(int[] arr){

        for(int i=1; i<arr.length; i++){

            int curr = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
            }
            arr[prev+1] = curr;
        }
    }

    
    void printPair(int[] arr){

        for(int i=0; i<arr.length; i++){
            int start =i;

            for(int end =i+1; end<arr.length; end++){

                for(int k = start; k<=end; k++){
                    System.out.print("("+arr[start]+","+arr[k]+")");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    void printPair(String[] arr){

        for(int i=0; i<arr.length; i++){
            int start =i;

            for(int end =i+1; end<arr.length; end++){

                for(int k = start; k<=end; k++){
                    System.out.print("("+arr[start]+","+arr[k]+")");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    void printReverce(int[] arr){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[arr.length-1-i]+" ");
        }
        System.out.println();
    }
    void printReverce(String[] arr){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[arr.length-1-i]+" ");
        }
        System.out.println();
    }
    void printReverce(char[] arr){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[arr.length-1-i]+" ");
        }
        System.out.println();
    }

   // Kadanes algorithm
    int maxSubArray(int[] arr){

        int max= Integer.MIN_VALUE;

        int cs=0;

        for(int i : arr){

            cs += i;
            if(cs<=0){
                cs =0;
            }
            max = Math.max(cs,max);
        }
        return max;
    }

     public static int trappingRain(int[] arr){

        int[] rightMax = new int[arr.length];
        int[] leftMax = new int[arr.length];

        leftMax[0] = arr[0];

        for(int i=1; i<arr.length; i++){

            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }

        rightMax[0] = arr[arr.length-1];
        for(int i =1; i<arr.length; i++){
            rightMax[i] = Math.max(rightMax[i-1], arr[arr.length-1-i]);
        }

        int trapWater =0;

        for(int i=0; i<arr.length; i++){
            int waterLevel = Math.min(rightMax[i], leftMax[i]);

            if(waterLevel>=0){
                trapWater += waterLevel-arr[i];
            }
        }

        return trapWater;
    }

    int buyAndSell(int prices[]){
        int maxProfit =0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(i==0){
                buyPrice = prices[i];
            }

            int sp = prices[i];

            if(buyPrice<=sp){

                int profit = sp-buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
        }

        return maxProfit;
    }

    int firstOcc(int[] arr,int key){

        for(int i=0; i<arr.length; i++){
            if(key==arr[i]) return i;
        }
        return -1;
    }
    
    int lastOcc(int[] arr,int key){

        for(int i= arr.length-1; i>=0; i--){

            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    boolean checkPelindrom(int arr[]){

        for(int i=0; i<arr.length; i++){

            if(arr[i]!= arr[arr.length-1-i]) return false;
        }
        return true;
    }

    boolean eachNumberPelindrom(int arr[]){


        for(int i=0; i<arr.length; i++){
            int comp = arr[i];
            int num = arr[i];

            int rev = 0;
            while(num!=0){
                rev = rev*10 + num/10;
                num = num/10;
            }
            if(comp!=rev){
                return false;
            }
        }

        return true;
    }
}