// ═══════════════════════════════════════════════════════
//  Problem  : 0102. Binary Tree Level Order Traversal
//  URL      : https://leetcode.com/problems/binary-tree-level-order-traversal/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 43 MB
//  Solved   : October 6, 2026
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
    public List<List<Integer>> levelOrder(TreeNode root) {
          List<List<Integer>> result =  new ArrayList<>();

        if (root ==  null) return result;

        Queue<TreeNode> queue =  new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            List<Integer> curr =  new ArrayList<>();
            for(int  i =0 ;  i< queue.size(); i++){
                TreeNode current =  queue.poll();
                curr.add(current.val);


                if (current.left!= null){
                    queue.offer(current.left);
                }
                if (current.right!= null){
                    queue.offer(current.right);
                }


            }
            result.add(curr);
        }

        return result ; 
        
    }
}