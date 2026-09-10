// ═══════════════════════════════════════════════════════
//  Problem  : 0015. 3Sum
//  URL      : https://leetcode.com/problems/3sum/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 1 ms
//  Memory   : 42.8 MB
//  Solved   : September 10, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res =  new ArrayList<>();
        Arrays.sort(nums);

        for (int i =  0 ; i < nums.length-2 ; i++){


            
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i+1;
            int r  = nums.length -1;

            while(l< r){
                int sum = nums[i]+ nums[r]+ nums[l];

                 if(sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l< r && nums[l]==nums[l+1])l++;
                    while(l< r && nums[r]==nums[r-1])r--;

                    i++;
                    r--;
                 }
                 else if(sum> 0)r--;
                 else l++;
                 
            }   
        }

        return res;
    }
}