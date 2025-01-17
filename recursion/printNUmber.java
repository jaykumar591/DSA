package recursion;

public class printNUmber {
    
    static void print(int n){
        if(n==1){
            System.out.println(1);
        }
        System.out.println(n);
        print(n-1);
    }
    static void printAsc(int n){
        if(n==1){
            System.out.println(1);
        }
        print(n-1);
        System.out.println(n);
    }

    static int fect(int n){
        if(n==0)return 1;return n*fect(n-1);
    }

    static int sumNthNumber(int n){ 
        if(n==0) return 1;return n+sumNthNumber(n-1);
    }
    static boolean checkSortedArray(int arr[], int i){
        if(arr.length==i) return true;
        if(arr[i]>arr[i+1]) return false;
        return checkSortedArray(arr,i++);
    }

    static int tiling(int n){
        if(n==0 || n==1) return n;

        int vertival = tiling(n-1);
        int horigental = tiling(n-2);

        return vertival+horigental;
    }
}
