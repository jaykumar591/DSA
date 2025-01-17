public class rotateMatrix {
    
    public static int[][] rotateMat(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int rotatedMatrix[][] = new int[m][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                rotatedMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original Matrix:");
        for(int i[] : matrix){
            for(int j : i) System.out.print(j + " ");
            System.out.println();
        }
        
        int rotated[][] = rotateMat(matrix);
        System.out.println("Rotated Matrix:");
        for(int i[] : rotated){
            for(int j : i) System.out.print(j + " ");
            System.out.println();
        }
    }
}
