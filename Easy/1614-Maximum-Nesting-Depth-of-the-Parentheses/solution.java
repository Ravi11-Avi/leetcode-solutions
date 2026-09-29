// ═══════════════════════════════════════════════════════
//  Problem  : 1614. Maximum Nesting Depth of the Parentheses
//  URL      : https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/?envType=daily-question&envId=2026-09-29
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
//  Solved   : September 30, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int maxDepth(String s) {
        int max = 0 , curr = 0;
        for (char c : s.toCharArray()){
            if (c== '('){
                curr++;
                max=  Math.max(max , curr);
            }else if (c == ')'){
                c--;
            }
        }

        return max;
    }
}