// ═══════════════════════════════════════════════════════
//  Problem  : 0836. Rectangle Overlap
//  URL      : https://leetcode.com/problems/rectangle-overlap/submissions/2141911461/?envType=daily-question&envId=2026-09-14
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
//  Solved   : September 15, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        if (rec1[2]> rec2[0]&& rec1[3]>rec2[1]  && rec1[0]< rec2[2] && rec1[1]< rec2[3]  )return true ;
        return false;
        
    }
    
}