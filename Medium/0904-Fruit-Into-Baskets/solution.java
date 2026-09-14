// ═══════════════════════════════════════════════════════
//  Problem  : 0904. Fruit Into Baskets
//  URL      : https://leetcode.com/problems/fruit-into-baskets/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.9 MB
//  Solved   : September 14, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits.length <=2) return fruits.length;
        
        int[] uniqueCount =  new int[fruits.length +1];


        int  l = 0 , maxfruite  =  0;
        int uniquefruite = 0 ;

        for (int r = 0 ; r < fruits.length; r++){


            if (uniqueCount[fruits[r]]==0){
                uniquefruite++;
            }

            uniqueCount[fruits[r]]++;

            while (uniquefruite>2){
                uniqueCount[fruits[r]]--;
                if (uniqueCount[fruits[r]]==0)uniquefruite--;
                l++;

            }

            maxfruite = Math.max(maxfruite ,  l-r+1);


        }
        return maxfruite;
    }
}