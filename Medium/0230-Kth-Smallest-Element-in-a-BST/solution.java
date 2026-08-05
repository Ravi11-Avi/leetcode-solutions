// ═══════════════════════════════════════════════════════
//  Problem  : 0230. Kth Smallest Element in a BST
//  URL      : https://leetcode.com/problems/kth-smallest-element-in-a-bst/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.4 MB
//  Solved   : August 5, 2026
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
    private int PreOrder = 0;
    public int kthSmallest(TreeNode root, int k) {
        
        if (root ==  null) return -1 ;

        if (root.left != null){
            int left = kthSmallest(root.left , k);
            if (left != -1 )return left;
        }

        if (PreOrder == k){
            return root.val;
        }
        PreOrder +=1;
                if (root.right != null){
            int right = kthSmallest(root.right , k);
            if (right != -1 )return right;
        }

        return -1 ;
    }
}