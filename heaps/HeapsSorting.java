
class Dscending{

    public void heapify(int arr[],int i,int size){

        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;

        if(left<size && arr[left]<arr[minIdx]){
            minIdx = left;
        }

        if(right<size && arr[right]<arr[minIdx]){
            minIdx = right;
        }

        if(minIdx!=i){
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            heapify(arr,minIdx,size);
        }
    }

    public void headSort(int arr[]){
        int n = arr.length;

        for(int i=n/2; i>=0; i--){
            heapify(arr,i,n);
        }

        for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }
}

public class HeapsSorting {
    
    public void heapify(int arr[],int i,int size){
        int left = 2*i+1;
        int right = 2*i+2; 
        int maxIdx = i;

        if(left<size && arr[left]> arr[maxIdx]){
            maxIdx = left;
        }
        if(right<size && arr[right]>arr[maxIdx]){
            maxIdx = right;
        }


        if(maxIdx!=i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr,maxIdx,size);
        }
    }

    public void heapSort(int arr[]){
        int n = arr.length;

        for(int i = n/2; i>=0; i--){
            heapify(arr,i,n);
        }

        for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }


    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,3,2,1};
        HeapsSorting  hs = new HeapsSorting();
        Dscending hsd = new Dscending();
        hs.heapSort(arr);

        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        hsd.headSort(arr);

        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
