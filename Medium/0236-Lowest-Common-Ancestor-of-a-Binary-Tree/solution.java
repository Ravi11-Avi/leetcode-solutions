// ═══════════════════════════════════════════════════════
//  Problem  : 0236. Lowest Common Ancestor of a Binary Tree
//  URL      : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
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
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root ==  null || root == p ||  root == q) return root ;


        TreeNode l1 = lowestCommonAncestor(root.left,  p ,q);
        TreeNode l2 = lowestCommonAncestor(root.right,  p ,q);

        if (l1 !=null && l2 != null){
            return root;
        }
        
        if (l1 ==  null){
            return l1;
        }else{
            return l2;
        }

        
    }

    
}