// ═══════════════════════════════════════════════════════
//  Problem  : 0938. Range Sum of BST
//  URL      : https://leetcode.com/problems/range-sum-of-bst/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.2 MB
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;


        return dfs(root, low ,high , 0);
    }

    public static int dfs (TreeNode node , int low , int high , int total ){
        if(node== null)return 0;
        
        if(node.val>low && node.val<high ){
            total+= node.val;
        }
        dfs(node.left,low,high, total);
        dfs(node.right,low,high, total);

        return total;
    }
}