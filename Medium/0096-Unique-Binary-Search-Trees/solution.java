// ═══════════════════════════════════════════════════════
//  Problem  : 0096. Unique Binary Search Trees
//  URL      : https://leetcode.com/problems/unique-binary-search-trees/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.9 MB
//  Solved   : July 30, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int numTrees(int n) {
    if (n<1) return n;
    int ans= 0;
    for (int i = 0 ; i < n ; i++){
        ans += numTrees(n-1)* numTrees(i-1);

    }
    return ans;
    }
}