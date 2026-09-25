// ═══════════════════════════════════════════════════════
//  Problem  : 0020. Valid Parentheses
//  URL      : https://leetcode.com/problems/valid-parentheses/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.7 MB
//  Solved   : September 25, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean isValid(String s) {
        boolean close =  true;
        for (char  c : s.toCharArray()){
            if (c == '('||c == '{' || c=='[')close = false;
            else close = true;
        }

        return close;
    }
}