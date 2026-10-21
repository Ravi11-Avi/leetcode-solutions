// ═══════════════════════════════════════════════════════
//  Problem  : 0988. Smallest String Starting From Leaf
//  URL      : https://leetcode.com/problems/smallest-string-starting-from-leaf/submissions/2177709497/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 2 ms
//  Memory   : 46 MB
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
    private String ss =  null;
    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return ss ; 
    }
    public void dfs( TreeNode root ,  StringBuilder sb ){
        if(root == null ) return ;
        sb.append((char)('a'+ root.val));

        if (root.left == null && root.right == null){
            sb.reverse();
            String current = sb.toString();

            sb.reverse();

            if(ss== null || current.compareTo(ss)<0){
                ss= current;
            }
           

        }
         dfs(root.left, sb);
            dfs(root.right, sb);
            sb.deleteCharAt(sb.length()-1);
            return ;

    }
}