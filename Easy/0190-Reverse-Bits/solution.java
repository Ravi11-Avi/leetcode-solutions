// ═══════════════════════════════════════════════════════
//  Problem  : 0190. Reverse Bits
//  URL      : https://leetcode.com/problems/reverse-bits/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.2 MB
//  Solved   : October 10, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int reverseBits(int n) {
        String bits  =  Integer.toBinaryString(n);
        String news =  new StringBuilder(bits).reverse().toString();
        int ab =  Integer.parseInt(news, 2);
        return ab;
    }
    
}