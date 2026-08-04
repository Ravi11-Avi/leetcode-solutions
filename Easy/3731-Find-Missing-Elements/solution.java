// ═══════════════════════════════════════════════════════
//  Problem  : 3731. Find Missing Elements
//  URL      : https://leetcode.com/problems/find-missing-elements/?envType=daily-question&envId=2026-08-04
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.7 MB
//  Solved   : August 4, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       List<Integer> aa =  new ArrayList<>();

       int len =  nums.length;

       int min = Integer.MAX_VALUE;
       int max = Integer.MAX_VALUE;

       for (int i :  nums){
        if (i < min)min = i ;
        if (i < max)max = i ;
       }


       for (int i  = min ;  i < nums.length ; i++){
            if (!aa.contains(i)){
                aa.add(i);
                break;
            }
       }

       return aa;
    }
}