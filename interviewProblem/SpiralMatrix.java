public class SpiralMatrix {
    

    static void spiralMatrix(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int rmin =0,rmax=matrix.length-1;
        int cmin=0,cmax=matrix[0].length-1;
        int count=0;

        
        while(count < m*n){
            // top boundary

            for(int i = cmin; i<=cmax && count<n*m; i++){
                System.out.println(matrix[rmin][i]);
                count++;
            }
            rmin++;

            // right boundary

            for(int i=rmin; i<=rmax && count<n*m;i++){
                System.out.println(matrix[i][cmax]);
                count++;
            }
            cmax++;
            // bottom boundary
            for(int i = cmax; i>=cmin && count<n*m; i--){
                System.out.println(matrix[rmax][i]);
                count++;
            }
            rmax--;
            // left boundary
            for(int i=rmax; i>=rmin && count<n*m; i--){
                System.out.println(matrix[i][cmin]);
                count++;
            }
            cmin++;
            

        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                           {4,5,6},
                           {7,8,9}
                          };
        spiralMatrix(matrix);

    }
}
