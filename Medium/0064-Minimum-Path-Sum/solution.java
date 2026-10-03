// ═══════════════════════════════════════════════════════
//  Problem  : 0064. Minimum Path Sum
//  URL      : https://leetcode.com/problems/minimum-path-sum/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.5 MB
//  Solved   : October 4, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int minPathSum(int[][] grid) {
        int row =  grid.length;
        int col =  grid[0].length;
        int sum = 0 ;

        for (int i = 0 ; i < col ; i ++){
            sum+= grid[1][i];
        }
        for(int i =1 ; i < row ; i++){
            sum+= grid[i][col-1];
        }
        return sum;
    }
}