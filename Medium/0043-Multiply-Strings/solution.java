// ═══════════════════════════════════════════════════════
//  Problem  : 0043. Multiply Strings
//  URL      : https://leetcode.com/problems/multiply-strings/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.7 MB
//  Solved   : October 4, 2026
// ═══════════════════════════════════════════════════════

import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
       

        return new BigInteger(num1).multiply(new BigInteger(num2)).toString();
    }
}