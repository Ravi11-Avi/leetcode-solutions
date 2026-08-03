// ═══════════════════════════════════════════════════════
//  Problem  : 0938. Range Sum of BST
//  URL      : https://leetcode.com/problems/range-sum-of-bst/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.5 MB
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
        if (root== null)return 0;
        int currval =0;
        if (root.val <= high && root.val >= low){
                currval = root.val;
        }

        return currval + rangeSumBST(root.left,low, high)+rangeSumBST(root.right,low, high);
    }
}