// ═══════════════════════════════════════════════════════
//  Problem  : 1111. Maximum Nesting Depth of Two Valid Parentheses Strings
//  URL      : https://leetcode.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/?envType=daily-question&envId=2026-09-30
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
//  Solved   : September 30, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] maxDepthAfterSplit(String seq) {

        boolean current = true ; 
        int [] res  =  new int[seq.length()]; 

        for(int i = 0 ; i < seq.length()-1; i++){
            if (seq.charAt(i) =='('){
                current = !current;
                if (current) res[i]= 0;
                else res[i]=1;

            }else  {
                if (current) res[i]= 0;
                else res[i]=1;
                current = !current;
            }
        }

        return res;

    }
}