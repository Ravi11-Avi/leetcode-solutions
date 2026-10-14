// ═══════════════════════════════════════════════════════
//  Problem  : 0100. Same Tree
//  URL      : https://leetcode.com/problems/same-tree/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42 MB
//  Solved   : October 14, 2026
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
     
        if (p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val)return false;
        return isSameTree(p.left, q.left)&& isSameTree(p.right ,q.right );
    }
}