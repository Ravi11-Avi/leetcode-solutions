// ═══════════════════════════════════════════════════════
//  Problem  : 0062. Reverse Pairs
//  URL      : https://leetcode.com/problems/unique-paths/submissions/2093134810/
//  Difficulty : Easy
//  Language : java
//  Solved   : August 4, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int reversePairs(int[] nums) {
       mergeSort(nums,0, nums.length);    
    }

    public static void  mergeSort(int[] nums,  int left , int right ){

        if(left>=  right)return ;

        int mid =  left +(left-right )/2;

        mergeSort(nums,left ,mid);
        mergeSort(nums, mid+1, right);

        merge(nums, left , mid , right );
    }

    public static void merge(int [} nums, int left , int mid , int right){

        int temp = new int []
    }
}