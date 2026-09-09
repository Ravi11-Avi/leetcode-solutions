// ═══════════════════════════════════════════════════════
//  Problem  : 0881. Boats to Save People
//  URL      : https://leetcode.com/problems/boats-to-save-people/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 2 ms
//  Memory   : 43 MB
//  Solved   : September 9, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l = 0 ; 
        int boat  = 0 ;
        int r = people.length-1;

        Arrays.sort(people);


        while (l< r){
            if (people[l]+people[r]>= limit){
                l++;
            }
                r--;
                boat++;
            
        }

        return boat;
    }
}