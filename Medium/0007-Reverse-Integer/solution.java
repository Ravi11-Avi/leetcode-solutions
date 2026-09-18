// ═══════════════════════════════════════════════════════
//  Problem  : 0007. Reverse Integer
//  URL      : https://leetcode.com/problems/reverse-integer/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.8 MB
//  Solved   : September 19, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int reverse(int x) {
         int actual = x;
        long rev =0;

        while ( actual !=0 ){

            int d =  actual %10 ;
            rev   =  rev*10 +d;
            actual /= 10;

        }
  
        if ( rev >Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        return (int) rev;
        
    }
}