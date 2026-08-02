// ═══════════════════════════════════════════════════════
//  Problem  : 0113. Path Sum II
//  URL      : https://leetcode.com/problems/path-sum-ii/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.4 MB
//  Solved   : August 2, 2026
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result  = new ArrayList<>();
        int sum  = 0 ;

        if (root ==  null)return result ;
        List<Integer> ans  =  new ArrayList<>();

        dfs(root ,targetSum , 0 , ans , result);
        return result ;

    }

    public static void dfs(TreeNode node ,  int target , int currSum  , List<Integer> currPath ,  List<List<Integer>> result){
        if (node == null) return ; 

        currSum+= node.val ;
        currPath.add(node.val);

        if (node.left == null && node.right == null ){
            if (currSum == target){
                result.add(currPath);
            }
            else{
                dfs(node.left ,target , currSum, currPath , result);
                dfs(node.right ,target , currSum, currPath , result);
            }
        }
        currPath.remove(currPath.size()-1);
    }
}