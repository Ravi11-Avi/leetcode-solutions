// ═══════════════════════════════════════════════════════
//  Problem  : 0207. Course Schedule
//  URL      : https://leetcode.com/problems/course-schedule/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.3 MB
//  Solved   : September 7, 2026
// ═══════════════════════════════════════════════════════

class Solution {

    public boolean isCycle(int src, int[][] edge, boolean[] vis,  boolean[] recP ){
        vis[src]= true;
        recP[src]= true;

        for(int i = 0 ; i < edge.length ; i++){
            int u= edge[i][0];
            int v= edge[i][1];

            if ( u == src){
                if(isCycle(v,edge, vis, recP))return true;
            }else{
                    if(recP[i])return true;  
            }

        }

        recP[src]= false;
        return false;

    }
    public boolean canFinish(int n, int[][] edge) {
        boolean[] visited = new boolean[n];
        boolean[] recPath = new boolean[n];

        for(int i = 0 ; i < n ; i ++){
            if (!visited[i]){
                if(isCycle(i,edge, visited, recPath)) return false;
            }
        }

        return true;

    }
}