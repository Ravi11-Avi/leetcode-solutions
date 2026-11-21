// ═══════════════════════════════════════════════════════
//  Problem  : 2243. Calculate Digit Sum of a String
//  URL      : https://leetcode.com/problems/calculate-digit-sum-of-a-string/?envType=daily-question&envId=2026-11-21
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.4 MB
//  Solved   : November 22, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public String digitSum(String s, int k) {

        while (s.length()>k){
            StringBuilder sb  = new StringBuilder();

            int sum = 0 ;
            for (int i =0 ; i < s.length(); i++){
                if(i%3==0){
                    sb.append(sum);
                    sum= 0;
                }
                sum += s.charAt(i) - '0';
                

            }
            sb.append(sum);
            s = sb.toString();
        }
        return s;
    }
}