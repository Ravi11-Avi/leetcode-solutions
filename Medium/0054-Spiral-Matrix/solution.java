// ═══════════════════════════════════════════════════════
//  Problem  : 0054. Spiral Matrix
//  URL      : https://leetcode.com/problems/spiral-matrix/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
//  Solved   : September 9, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
    

        int m  =  matrix.length;
        int n  =  matrix[0].length;

        boolean[][] visited = new boolean[m][n];

        int sr = 0,sc= 0, er = m-1 ,ec= n-1;

        while (sr<=er&& sc<= ec){
            for(int i = sc ; i<= ec ; i++){
                result.add(matrix[sr][i]);

            }
            for(int i = sr+1 ; i <= er ; i++){
                 result.add(matrix[i][ec]);
            

            }

            for (int i = ec-1 ; i>= sc; i--){
                result.add(matrix[er][i]);
            }

            for (int i = er-1 ; i>=sr+1; i-- ){
                result.add(matrix[i][sc]);
            }

            sr++; sc++; er--;ec--;
        }

        
        return result;
        
    }
}