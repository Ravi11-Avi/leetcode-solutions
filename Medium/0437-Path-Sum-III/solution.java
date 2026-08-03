// ═══════════════════════════════════════════════════════
//  Problem  : 0437. Path Sum III
//  URL      : https://leetcode.com/problems/path-sum-iii/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.6 MB
//  Solved   : August 3, 2026
// ═══════════════════════════════════════════════════════

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        int result =  0 ;
        if (root== null)return result ;

        dfs(root, targetSum, result , 0);

        return result ; 
    }
    public static void dfs (TreeNode node , int target , int result  ,  int currentSum ){
        if (node == null)return ;

        currentSum += node.val;
        if(node.left ==  null && node.right == null ){
            if (currentSum == target){
                result++ ;
            }
        }else{
            dfs(node.left ,  target , result , currentSum);
            dfs(node.right ,  target , result , currentSum);
        }
    }
}