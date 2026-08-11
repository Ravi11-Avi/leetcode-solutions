// ═══════════════════════════════════════════════════════
//  Problem  : 0463. Island Perimeter
//  URL      : https://leetcode.com/problems/island-perimeter/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.3 MB
//  Solved   : August 11, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int islandPerimeter(int[][] grid) {

        int ans = 0;
        for( int i = 0 ; i< grid.length ; i++){
            for (int j = 0 ; j < grid[0].length ; j++){

                if(grid[i][j]== 1){
                            ans +=4;

                        
                      if (i>0 && grid[i-1][j]==1){
                        ans-=2;
                    }if (j>0 && grid[i][j-1]==1){
                        ans -=2;
                    }
                }
                  
            }
        }

        return ans;
    }
}