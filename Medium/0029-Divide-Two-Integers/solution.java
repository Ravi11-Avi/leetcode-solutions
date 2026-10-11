// ═══════════════════════════════════════════════════════
//  Problem  : 0029. Divide Two Integers
//  URL      : https://leetcode.com/problems/divide-two-integers/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.8 MB
//  Solved   : October 11, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int divide(int dividend, int divisor) {
       int res =1 ;
       int curr = divisor;
       int prev = 0;

       while(curr <= dividend){
        prev = curr;
        curr= curr*(res++);
       }

       return prev;
    }
}