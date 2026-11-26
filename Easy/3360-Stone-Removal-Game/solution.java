// ═══════════════════════════════════════════════════════
//  Problem  : 3360. Stone Removal Game
//  URL      : https://leetcode.com/problems/stone-removal-game/submissions/2204207351/?envType=daily-question&envId=2026-11-26
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.4 MB
//  Solved   : November 27, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean canAliceWin(int n) {
        int na = 10;
        boolean s =false ;
        while(n >= na ){
            n-= na ; 
            na--;
            s = !s;
        }
        return s;
    }
}