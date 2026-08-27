// ═══════════════════════════════════════════════════════
//  Problem  : 1992. Find All Groups of Farmland
//  URL      : https://leetcode.com/problems/find-all-groups-of-farmland/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 43 MB
//  Solved   : August 27, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int[][] findFarmland(int[][] land) {
        int row = land.length;
        int col  = land[0].length;

        List<int[]> result = new ArrayList<>();


        for (int i =  0 ; i <row ; i ++ ){
            for (int j = 0 ; j< col ; j++){
                if (land[i][j]== 1){
                    int x= i, y = j;
                    for(x = i ;  x< row ; x++){
                        for (y = j ; y < col ; y++){
                            land[x][y]=0;
                        }
                    }

                    int[] aa = new int[]{i,j,x-1,y-1};

                    result.add(aa);
                }
            }
        }

        return result.toArray(new int[result.size()][]);

    }
}