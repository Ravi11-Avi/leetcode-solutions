// ═══════════════════════════════════════════════════════
//  Problem  : 0319. Bulb Switcher
//  URL      : https://leetcode.com/problems/bulb-switcher/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.2 MB
//  Solved   : August 16, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int bulbSwitch(int n) {
        //  boolean[] bulb =  new boolean[n+1];
        //  for (int i = 1 ;  i<=n ; i ++){
        //     for (int j = 1 ; j <=n ; j++ ){
        //         if (j%i == 0){
        //              bulb[j] = !bulb[j];
        //         }
        //     }
        //  }
        //     int count = 0;
        //  for (  boolean b :  bulb){
        //     if (b)count ++;
        //  }

        //  return count;

        return (int) Math.sqrt(n);
    }
}