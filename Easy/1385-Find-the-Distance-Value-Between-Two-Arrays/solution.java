// ═══════════════════════════════════════════════════════
//  Problem  : 1385. Find the Distance Value Between Two Arrays
//  URL      : https://leetcode.com/problems/find-the-distance-value-between-two-arrays/?envType=daily-question&envId=2026-11-05
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.5 MB
//  Solved   : November 5, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
    int res = 0; 

    if (arr1.length==0 || arr2.length == 0 )return res;

    for (int i :  arr1){
        for(int j : arr2){
            if (Math.abs (i-j)<=d)res++;
        }
    } 
    return res;   
    }
}