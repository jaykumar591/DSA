public class Occurance_in_Array {           
    public int firstOcc(int arr[],int key,int i){
        if(i==arr.length) return -1; //Base case correction
        if(key==arr[i]) return i;
        return firstOcc(arr,key,i+1); //Corrected increment
    }     
    public int lastOcc(int arr[],int key,int i){
        if(i<0) return -1; //Base case correction
        if(key==arr[i]) return i;
        return lastOcc(arr,key,i-1); //Corrected decrement
    }          
    public static void main(String[] args) {
        Occurance_in_Array obj = new Occurance_in_Array();
        int arr[] = {5,4,5,7,8,5,9};
        int key = 5;
        int first = obj.firstOcc(arr,key,0);
        int last = obj.lastOcc(arr,key,arr.length-1);
        System.out.println("First Occurrence: "+ first);
        System.out.println("Last Occurrence: "+ last);
    }
}