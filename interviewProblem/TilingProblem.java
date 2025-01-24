public class TilingProblem {
    
    public static int tiling(int n){
        if(n==0|| n==1)return 1;

        int verticalTiling = tiling(n-1);
        int horizontalTiling = tiling(n-2);
        return verticalTiling+horizontalTiling;

    }
    public static void main(String[] args) {
        System.out.println(tiling(10));
    }
}
