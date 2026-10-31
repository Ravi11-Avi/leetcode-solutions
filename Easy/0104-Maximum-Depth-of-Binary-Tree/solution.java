// ═══════════════════════════════════════════════════════
//  Problem  : 0104. Maximum Depth of Binary Tree
//  URL      : https://leetcode.com/problems/maximum-depth-of-binary-tree/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41 MB
//  Solved   : October 31, 2026
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
    public int maxDepth(TreeNode root) {
        if (root ==  null )return 0;

        int left =  maxDepth(root.left)+1;
        int right =  maxDepth(root.right)+1;

        return Math.max(left, right);
    }
}