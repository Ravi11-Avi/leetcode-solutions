// ═══════════════════════════════════════════════════════
//  Problem  : 1161. Maximum Level Sum of a Binary Tree
//  URL      : https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.6 MB
//  Solved   : October 17, 2026
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
    public int maxLevelSum(TreeNode root) {
        int maxl = 0 ; 
        if (root == null) return maxl;
        int maxsum =0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int n = q.size();
            int level =1;
            int sum= 0;

            for (int i = 0 ; i < n ; i++){
                TreeNode curr = q.poll();
                sum+= curr.val;

                if (curr.left!=null)q.offer(curr.left);
                if (curr.right!=null)q.offer(curr.right);
            }
            if (maxsum< sum){
                maxsum = sum;
                maxl =level;
            }
            level++;
        }
        return maxl;

    }
}