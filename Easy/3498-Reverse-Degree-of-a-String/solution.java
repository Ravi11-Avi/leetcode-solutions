// ═══════════════════════════════════════════════════════
//  Problem  : 3498. Reverse Degree of a String
//  URL      : https://leetcode.com/problems/reverse-degree-of-a-string/?envType=daily-question&envId=2026-09-20
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.7 MB
//  Solved   : September 20, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int reverseDegree(String s) {
        int sum = 0, i =1;
        for (char c  : s.toCharArray())sum += (i++)*('z'-c+1);
        return sum;
    }
}