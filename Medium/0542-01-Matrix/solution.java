// ═══════════════════════════════════════════════════════
//  Problem  : 0542. 01 Matrix
//  URL      : https://leetcode.com/problems/01-matrix/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.9 MB
//  Solved   : August 13, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length ;
        int col = mat[0].length;

        Queue<int[]> queue =  new LinkedList<>();

        for (int i = 0 ; i< row; i++){
            for (int j = 0 ;  j < col ; j++){
                if(mat[i][j]==0){
                    queue.offer(new int[]{i,j});
                }else{
                    mat[i][j] = -1;
                }
            }
        }

        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};  


        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            
            for (int[] d : dir){
                int nr = curr[0] + d[0];
                int nc = curr[1] + d[1];

                if (nr>=0 && nc>=0 && nr<row-1 && nc < col-1){
                    if (mat[nr][nc]==-1){
                        mat[nr][nc]= mat[curr[0]][curr[1]]+1;
                        queue.offer(new int[]{nr,nc}); 
                    }
                }
            }

        }
        return mat;
            
            
            
            
    }
}