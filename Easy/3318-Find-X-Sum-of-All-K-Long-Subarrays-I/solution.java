// ═══════════════════════════════════════════════════════
//  Problem  : 3318. Find X-Sum of All K-Long Subarrays I
//  URL      : https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays-i/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 43 MB
//  Solved   : September 12, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int[] res =  new int [nums.length -k+1];

        int l = 0 ;
        int r = k;

        int residx = 0;
        for (int i = l ; i< r; i++ ){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            };

        

        while (r<= nums.length){
            HashMap<Integer, Integer> maxVal =  new HashMap<>();

            for (int n : map.keySet()){
                if (!maxVal.containsKey(map.get(n))){
                    maxVal.put(map.get(n), n);
                }else{
                    if (n> maxVal.get(map.get(n))){
                        maxVal.put(map.get(n), n);
                    }
                }
            }
            List<Integer> fre =  new ArrayList<>(maxVal.keySet());
            Collections.sort(fre, Collections.reverseOrder());

            int ans= 0;
            int count =0;

            for (int f: fre){
                if (count >= x)break;
                ans +=  maxVal.get(f)* f;
                count++;
            }
            res[residx++]= ans;

            if (r< nums.length){
                if (map.get(nums[l])==1){
                    map.remove(nums[l]);
                }else{
                    map.put(nums[l], map.get(nums[l])-1);
                }
                l++;
                

                map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            }
            r++;
            
            

        }

        return res;
        
    }
}