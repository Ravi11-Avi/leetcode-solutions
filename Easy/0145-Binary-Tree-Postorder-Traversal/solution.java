// ═══════════════════════════════════════════════════════
//  Problem  : 0145. Binary Tree Postorder Traversal
//  URL      : https://leetcode.com/problems/binary-tree-postorder-traversal/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.3 MB
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> aa =  new ArrayList<>();
        if (root ==  null)return aa;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        aa.add(root.val);
        return aa;

        
    }
}