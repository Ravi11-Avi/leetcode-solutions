// ═══════════════════════════════════════════════════════
//  Problem  : 0005. Longest Palindromic Substring
//  URL      : https://leetcode.com/problems/longest-palindromic-substring/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 43 MB
//  Solved   : September 12, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public String longestPalindrome(String s) {

        String p  =  new String();
        

        for (int i =  0; i < s.length(); i++){
            int l = i-1;
            int r  = i+1 ;

            while (l>=0 && r<s.length()&& s.charAt(l)== s.charAt(r)){
                 p = s.substring(l,r);
                l--;
                r++;
            }
            l=i;
            while (l>=0 && r<s.length()&& s.charAt(l)== s.charAt(r)){
                
                 p = s.substring(l,r);
                l--;
                r++;
            }
            
            
        }

        return p;
    }
}