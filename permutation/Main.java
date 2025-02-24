

public class Main{

    static void getNextPermutation(int arr[]){

        int pivot =-1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot==-1)return; // reverser array

        for(int i=arr.length-1; i>pivot; i--){
            if(arr[i]>arr[pivot]){
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }

        int i=pivot+1;
        int j=arr.length-1;
        while(i!=j){
            int temp = arr[i];
            arr[i]= arr[pivot];
            arr[pivot] = temp;
            i++;
            j--;

        }
    }

    public static void main(String[] args) {
        
    }
}