// package tcscodevita;

import java.util.*;
public class BoardGame {
    static class Cell{
        int x,y,move;
        Cell(int x,int y,int move){
            this.x=x;
            this.y=y;
            this.move = move;
        }
    }

    static int[] dy = {0,1,0,-1};
    static int[] dx = {1,0,-1,0};

    public static boolean isValid(int x,int y,int m,int n,int[][] grid,boolean[][] vigited){
        return x>=0 && y>=0 && x<m && y<n && grid[x][y]==0 && !vigited[x][y];
    }

    public static int breadthFisrtSearch(int[][] grid, int m,int n,int srcx,int srcy,int destx,int desty,int movex,int movey){
        Queue<Cell> queue = new LinkedList<>();
        int[][] direction = {{movex,movey},{movey,-movex},{-movey,movex},{-movex,-movey}};
        boolean[][] visited = new boolean[m][n];

        while (!queue.isEmpty()) {
            Cell curr = queue.poll();

            if(curr.x==destx && curr.y==desty){
                return curr.move;
            }
            for(int dir[] : direction){
                int newx = curr.x+dir[0];
                int newy = curr.y+dir[1];

                if(isValid(newx,newy,m,n,grid,visited)){
                    queue.offer(new Cell(newx,newy,curr.move+1));
                    visited[newx][newy] = true;
                }
            }
            
        }



        return -1;
    }

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

        int result = breadthFisrtSearch(grid, M, N, srcX, srcY, destX, destY, moveX, moveY);
        System.out.println(result);

        sc.close();
    }

}
