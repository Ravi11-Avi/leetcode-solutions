// ═══════════════════════════════════════════════════════
//  Problem  : 0064. Minimum Path Sum
//  URL      : https://leetcode.com/problems/minimum-path-sum/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.4 MB
//  Solved   : October 4, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int minPathSum(int[][] grid) {
        int row =  grid.length;
        int col =  grid[0].length;
 

        for (int i = 1 ; i < col ; i ++){
            grid[0][i]+= grid[0][i-1];
        }
        for(int i =1 ; i < row ; i++){
            grid[i][0]+= grid[i-1][0];
        }

        for(int i = 1 ; i < row ; i++){
            for (int  j = 1 ; j < col ; j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return   grid[row-1][col-1] ;
    }
}