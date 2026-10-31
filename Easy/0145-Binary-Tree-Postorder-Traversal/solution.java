// ═══════════════════════════════════════════════════════
//  Problem  : 0145. Binary Tree Postorder Traversal
//  URL      : https://leetcode.com/problems/binary-tree-postorder-traversal/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.9 MB
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

        aa.addAll(postorderTraversal(root.left));
        aa.addAll(postorderTraversal(root.right));
        aa.add(root.val);
        return aa;
        
    }
}