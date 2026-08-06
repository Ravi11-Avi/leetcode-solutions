// ═══════════════════════════════════════════════════════
//  Problem  : 3345. Smallest Divisible Digit Product I
//  URL      : https://leetcode.com/problems/smallest-divisible-digit-product-i/?envType=daily-question&envId=2026-08-06
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.8 MB
//  Solved   : August 6, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){
            int temp = n ;
            int prd  = 1 ; 
            while (temp> 0){
                prd = temp%10;
                temp /=10;
            }
            if (prd% t == 0){
                return prd;
            }
            n++;
            

        }
    }
}