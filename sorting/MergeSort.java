package sorting;


public class MergeSort {
    
    public static void mergeSort(int arr[], int l, int r) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[ei - si + 1];
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
    }

    public void mergeSort(String[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid = 1+(r-1)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid,r);
    }

    public void merge(String arr[],int si,int mid,int ei){
        int i=si;
        int j= mid+1;
        int k=0;
        String temp[ ] = new int [ei-si+1];

        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])<=0){
                temp[k++] =arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        while(j<=mid){
            temp[k++] =arr[j++];
        }
        for(k=0; k<temp.length; k++){
            arr[si+k] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 21, 4};
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) System.out.print(i + " ");
        System.out.println("");
    }
}
