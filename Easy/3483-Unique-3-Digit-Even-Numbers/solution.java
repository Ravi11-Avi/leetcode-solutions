// ═══════════════════════════════════════════════════════
//  Problem  : 3483. Unique 3-Digit Even Numbers
//  URL      : https://leetcode.com/problems/unique-3-digit-even-numbers/?envType=daily-question&envId=2026-09-11
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
//  Solved   : September 11, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int totalNumbers(int[] digits) {
        int count  = 0; 
        HashSet<Integer> set = new HashSet<>();
        for(int i : digits){
            if(i%2 ==0)set.add(i);
        }

        return set.size();
    }
}