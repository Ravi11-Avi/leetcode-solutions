// ═══════════════════════════════════════════════════════
//  Problem  : 3551. Minimum Swaps to Sort by Digit Sum
//  URL      : https://leetcode.com/problems/minimum-swaps-to-sort-by-digit-sum/?envType=daily-question&envId=2026-10-17
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.4 MB
//  Solved   : October 17, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int minSwaps(int[] nums) {
        int[][] a =  new int[nums.length][3];
        
        for (int i = 0 ; i < nums.length ; i ++){
            int sum = 0 ;
            int n =  nums[i];
            while(n>0){
                sum+= n%10;
                n /=10;
            }
            a[i][0]= nums[i];
            a[i][1]= sum;
            a[i][2]= i;
        }

        Arrays.sort(a, (e1,e2)->{
            if(e1!= e2)return Integer.compare(e1[1], e2[1]);
            return Integer.compare(e1[0],e2[0]);
        });

        boolean[] vis =  new boolean[nums.length];
        int total = 0 ;

        for (int i = 0 ; i < nums.length ;i++){
            if (vis[i]|| a[i][2]==1)continue;

            int cyc =0;
            int j = i ;

            while(!vis[j]){
                vis[j]= true;
                j = a[j][2];
                cyc++;
            }

            if (cyc >1){
                total += cyc-1;
            }
        }
        return total;

    }
}