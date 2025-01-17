package divideConquer;

public class Sorting {
    

    void sort(int arr[],int si ,int ei){

        if(si>=ei)return;

        int mid = si + (ei-si)/2;

        sort(arr, si,mid);//left
        sort(arr, mid+1, ei);

        morge(arr, si,mid, ei);
    }

    static void morge(int[] arr, int si , int mid , int ei){

        int i = si;
        int j = mid;
        int k =0;
        int[] temp = new int[ei-si+1];

        while (i<=mid && j<=ei) {
            
            if(arr[i]<arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        while(i<=mid) temp[k++] = arr[i++];
        while(j<=ei) temp[k++] = arr[j++];
        //copy all data in original array

        for (int l = 0; l < temp.length; l++) {
            arr[i+si] = temp[i];
        }
    }
}
