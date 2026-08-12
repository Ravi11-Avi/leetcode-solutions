// ═══════════════════════════════════════════════════════
//  Problem  : 0695. Max Area of Island
//  URL      : https://leetcode.com/problems/max-area-of-island/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.6 MB
//  Solved   : August 12, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxarea  = 0;

        for (int i = 0 ; i< grid.length ; i++){
            for (int j = 0 ; j< grid[0].length ; j++){
                if (grid[i][j]==1){
                  int curarea =   dfs(i, j, grid );
                    maxarea = Math.max(maxarea, curarea);
                }
            }
        }
        return maxarea ;
    }
    public int dfs(int row , int col , int[][] grid){
        if (row< 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col]!= 1)return 0;

        grid[row][col]= 2;
        int area =1;

        dfs(row+1, col, grid);
        dfs(row-1, col, grid);
        dfs(row, col+1, grid);
        dfs(row, col-1, grid);
        return area;
    }
}