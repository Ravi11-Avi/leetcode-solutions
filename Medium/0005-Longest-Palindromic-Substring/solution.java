// ═══════════════════════════════════════════════════════
//  Problem  : 0005. Longest Palindromic Substring
//  URL      : https://leetcode.com/problems/longest-palindromic-substring/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.7 MB
//  Solved   : September 12, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public String longestPalindrome(String s) {

        

        String p = s.substring(0, 1);
        if (s == null || s.length() <= 1) {
            return s; 
        }        

        for (int i =  0; i < s.length(); i++){
            int l = i-1;
            int r  = i+1 ;

            while (l>=0 && r<s.length()&& s.charAt(l)== s.charAt(r)){

                if ((r-l+1)> p.length()){
                         p = s.substring(l,r+1);
                  
                }
                  l--;
                    r++;
                
            }
            l=i;
            r= i+1;
            while (l>=0 && r<s.length()&& s.charAt(l)== s.charAt(r)){
                
               if ((r-l+1)> p.length()){
                         p = s.substring(l,r+1);
               
                }
                  l--;
                    r++;
            }
            
            
        }

        return p;
    }
}