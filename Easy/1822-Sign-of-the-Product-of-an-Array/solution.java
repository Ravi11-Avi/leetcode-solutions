// ═══════════════════════════════════════════════════════
//  Problem  : 1822. Sign of the Product of an Array
//  URL      : https://leetcode.com/problems/sign-of-the-product-of-an-array/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.5 MB
//  Solved   : September 23, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int arraySign(int[] nums) {
        for (int i : nums){
            if (i>0)return 1;
            else if (i== 0)return 0;
            else return -1;
        }
        return 0;
    }
}