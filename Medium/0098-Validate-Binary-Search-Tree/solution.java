// ═══════════════════════════════════════════════════════
//  Problem  : 0098. Validate Binary Search Tree
//  URL      : https://leetcode.com/problems/validate-binary-search-tree/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.4 MB
//  Solved   : October 23, 2026
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
        public boolean isValidBST(TreeNode root) {
            return finder(root , null ,null);
        }
        public boolean finder(TreeNode node , Integer min , Integer  max){
             if(node ==  null )return true ;

             if (max!= null&& max <= node.val || min!= null && min >= node.val)return false;

             return finder(node.left , node.val , max)&&finder(node.right, min , node.val);
        }
       
    }