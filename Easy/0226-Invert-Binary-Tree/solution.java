// ═══════════════════════════════════════════════════════
//  Problem  : 0226. Invert Binary Tree
//  URL      : https://leetcode.com/problems/invert-binary-tree/submissions/2177422108/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.7 MB
//  Solved   : October 21, 2026
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
    public TreeNode invertTree(TreeNode root) {
        if(root == null)return null;

        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp =  root.left;
         root.left =  root.right;
         root.right =  temp;
        

        return root;
    }
}