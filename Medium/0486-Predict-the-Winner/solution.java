// ═══════════════════════════════════════════════════════
//  Problem  : 0486. Predict the Winner
//  URL      : https://leetcode.com/problems/predict-the-winner/?envType=daily-question&envId=2026-08-01
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.1 MB
//  Solved   : August 1, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean predictTheWinner(int[] nums) {

        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i <nums.length ; i ++){
            if(i%2 == 0 ){
                p2+=nums[i];
            }else{
                p1 +=nums[i];
            }
        }
        if (p1> p2)return true;

        return false;
        
    }
}