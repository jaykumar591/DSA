import java.util.*;

public class DesertQueen {
    
    // Directions for moving in the grid: up, down, left, right
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    
    
    public static int minWaterCost(int N, String[][] grid) {
        // Initialize water cost array with a high value (infinity)
        int[][] waterCost = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(waterCost[i], Integer.MAX_VALUE);
        }

       
        int startX = -1, startY = -1, endX = -1, endY = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j].equals("S")) {
                    startX = i;
                    startY = j;
                } else if (grid[i][j].equals("E")) {
                    endX = i;
                    endY = j;
                }
            }
        }
        
        Queue<Integer>[] queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        waterCost[startX][startY] = 0;
        
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1];

          
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                
               
                if (nx >= 0 && ny >= 0 && nx < N && ny < N && !grid[nx][ny].equals("M")) {
                   
                    int newCost = waterCost[x][y] + (grid[nx][ny].equals("D") ? 1 : 0);
                    
                   
                    if (newCost < waterCost[nx][ny]) {
                        waterCost[nx][ny] = newCost;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        
       
        return waterCost[endX][endY];
    }

 
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); 
        
        
        String[][] grid = new String[N][N];
        for (int i = 0; i < N; i++) {
            grid[i] = scanner.nextLine().split(" ");
        }
        
        
        int result = minWaterCost(N, grid);
        

        System.out.println(result);
        
        scanner.close();
    }
}
