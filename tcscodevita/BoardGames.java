

// package tcscodevita;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BoardGame {
    static class Cell {
        int x, y, moves;
        Cell(int x, int y, int moves) {
            this.x = x;
            this.y = y;
            this.moves = moves;
        }
    }

    static int[] dx = {1, 0, -1, 0}; 
    static int[] dy = {0, 1, 0, -1}; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] grid = new int[M][N];

       
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int srcX = sc.nextInt();
        int srcY = sc.nextInt();
        int destX = sc.nextInt();
        int destY = sc.nextInt();

        int moveX = sc.nextInt();
        int moveY = sc.nextInt();

        int result = bfs(grid, M, N, srcX, srcY, destX, destY, moveX, moveY);
        System.out.println(result);

        sc.close();
    }

    static int bfs(int[][] grid, int M, int N, int srcX, int srcY, int destX, int destY, int moveX, int moveY) {
        int[][] directions = {
                {moveX, moveY},         // Forward
                {moveY, -moveX},        // Right (90 degrees clockwise)
                {-moveY, moveX},        // Left (90 degrees anticlockwise)
                {-moveX, -moveY}        // Backward (180 degrees)
        };

        Queue<Cell> queue = new LinkedList<>();
        boolean[][] visited = new boolean[M][N];

   
        queue.offer(new Cell(srcX, srcY, 0));
        visited[srcX][srcY] = true;

        while (!queue.isEmpty()) {
            Cell current = queue.poll();

          
            if (current.x == destX && current.y == destY) {
                return current.moves;
            }

            for (int[] dir : directions) {
                int newX = current.x + dir[0];
                int newY = current.y + dir[1];

               
                if (isValid(newX, newY, M, N, grid, visited)) {
                    queue.offer(new Cell(newX, newY, current.moves + 1));
                    visited[newX][newY] = true;
                }
            }
        }

        return -1;
    }
    

    static boolean isValid(int x, int y, int M, int N, int[][] grid, boolean[][] visited) {
        return x >= 0 && y >= 0 && x < M && y < N && grid[x][y] == 0 && !visited[x][y];
    }
}
