// ═══════════════════════════════════════════════════════
//  Problem  : 0292. Nim Game
//  URL      : https://leetcode.com/problems/nim-game/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.1 MB
//  Solved   : August 28, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean canWinNim(int n) {
        if (n%3 ==0 &&(n/3)%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}