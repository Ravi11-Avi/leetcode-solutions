// ═══════════════════════════════════════════════════════
//  Problem  : 0062. Unique Paths
//  URL      : https://leetcode.com/problems/unique-paths/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.3 MB
//  Solved   : August 4, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int uniquePaths(int m, int n) {
        return m*(m-n);
    }
}