// ═══════════════════════════════════════════════════════
//  Problem  : 0038. Count and Say
//  URL      : https://leetcode.com/problems/count-and-say/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.1 MB
//  Solved   : October 4, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public String countAndSay(int n) {
        
        String c = "1" ;
        for (int i = 0 ; i < n ; i++){
            StringBuilder sb  =  new StringBuilder();
            int count = 1 ; 

            for (int j = 1 ; j< c.length (); j++){
                if (c.charAt(j)== c.charAt(j-1))count++;
                else{
                    sb.append(count);
                    sb.append(c.charAt(j-1));
                }
            }

            c = sb.toString();

            

        }
        return c;
    }
}