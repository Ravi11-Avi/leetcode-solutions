// ═══════════════════════════════════════════════════════
//  Problem  : 0011. Container With Most Water
//  URL      : https://leetcode.com/problems/container-with-most-water/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42 MB
//  Solved   : September 9, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j =  height.length -1; 
        int max= 0 ;

        while (i< j){
            int wid = i-j;

            int cm =  Math.min(height[i], height[j])* wid;

            if (max< cm) max= cm;

            if (height[i]< height[j]) i++;
            else j--;
       }

       return max;
    }
}