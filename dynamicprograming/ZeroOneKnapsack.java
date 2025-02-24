package dynamicprograming;

public class ZeroOneKnapsack {
    public static int knapsack(int val[],int wt[],int w , int n){
        if(w==0 || n==0)return 0;

        if(wt[n-1]<=w){
            int ans1 = val[n-1]+knapsack(val,wt,w-wt[n-1],n-1);
            int ans2 = knapsack(val,wt,w,n-1);
            return Math.max(ans1,ans2);
        }else{
            return  knapsack(val,wt,w,n-1);
        }
    }

    public static int knapsack(int val[],int wt[],int w,int n,int dp[][]){
        if(w==0|| n==0)return 0;
        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        if(wt[n-1]<=w){
            int ans1 = val[n-1]+knapsack(val,wt,w-wt[n-1],n-1,dp);
            int ans2 = knapsack(val,wt,w,n-1,dp);

            dp[n][w] = Math.max (ans1,ans2);
            return dp[n][w];
        }else{
            dp[n][w] = knapsack(val,wt,w,n-1,dp);
            return dp[n][w];
        }

    }

    public static int find(int val[],int wt[],int n,int c){
        if(n==0|| c==0)return 0;
        if(wt[n-1]<=c){
            
           int ans1= val[n-1]+ find(val,wt,n-1,c-wt[n-1]);
           int ans2 = find(val,wt,n-1,c);
           return Math.max(ans1,ans2);
        }
        else{
            return find(val,wt,n-1,c);
        }
    
    } 

    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w = 7;
        System.out.println(find(val,wt,wt.length,w));
        
    }
}
