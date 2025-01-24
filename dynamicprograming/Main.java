package dynamicprograming;

public class Main {
    
    public static int printfibonacci(int n){
        if(n==0 || n==1)return n;

         return printfibonacci(n-1)+printfibonacci(n-2);
    }

     public static int fib(int n,int[] f){
        if(n==0 || n==1)return n;
        if(f[n]!=0){
            return f[n];
        }
        f[n] = fib(n-1,f)+fib(n-2,f);
        return f[n];

     }

     public static int fibTabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] =1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n]; 
     }

     public static int climbingStairs(int n){
        if(n==0 || n==1)return 1;

        return climbingStairs(n-1)+climbingStairs(n-2);
     }
     public static int climbingStairsMemoaization(int n,int temp[]){
        if(n==1 || n==2)return n;
        if(temp[n]!=0){
            return temp[n];
        }
        return climbingStairsMemoaization(n-1,temp)+climbingStairsMemoaization(n-2,temp);
     }
     public static int climbingStairsTabulation(int n){
        int temp[] = new int[n+1];
        temp[0] = 1;
        temp[1] = 1;

        for(int i=2; i<=n; i++){
            temp[i] = temp[i-1]+temp[i-2];
        }
        return temp[n];

     }

      
    public static void main(String[] args) {
        System.out.println(climbingStairsTabulation(5));

    }
}
