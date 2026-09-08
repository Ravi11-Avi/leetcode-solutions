// ═══════════════════════════════════════════════════════
//  Problem  : 0322. Coin Change
//  URL      : https://leetcode.com/problems/coin-change/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.1 MB
//  Solved   : September 8, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int coinChange(int[] coins, int amount) {
        

        int[] dp =  new int[amount+1];

        if(amount<1)return 0;

        for (int i = 0 ; i< amount ; i++){
            dp[i]= Integer.MAX_VALUE;

            for(int coin : coins){
                if(coin<= i && dp[i-coin]!= Integer.MAX_VALUE){
                    dp[i]=  Integer.min(dp[i], 1+ dp[coin-i]);
                }
            } 
        }

         return dp[amount]<= Integer.MAX_VALUE ?-1: dp[amount];
    }
}