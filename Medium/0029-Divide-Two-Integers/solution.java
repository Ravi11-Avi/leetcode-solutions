// ═══════════════════════════════════════════════════════
//  Problem  : 0029. Divide Two Integers
//  URL      : https://leetcode.com/problems/divide-two-integers/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.7 MB
//  Solved   : October 4, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int divide(int dividend, int divisor) {
       int res =1 ;
       int curr = divisor;

       while(curr <= dividend){
        curr= curr*(res++);
       }

       return res;
    }
}