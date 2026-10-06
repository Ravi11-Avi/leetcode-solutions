// ═══════════════════════════════════════════════════════
//  Problem  : 0103. Binary Tree Zigzag Level Order Traversal
//  URL      : https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(root ==  null) return result;
        Queue<TreeNode> queue =  new LinkedList<>();
        queue.offer(root);
        boolean ziz=  true;



        while (!queue.isEmpty()){
            int size =  queue.size();
            List<Integer> currlevel  =  new ArrayList<>();

            for (int i = 0 ; i< size ; i++){
                TreeNode curr =  queue.poll();

                if (ziz)currlevel.addLast(curr.val);
                else currlevel.addFirst(curr.val);


                if (curr.left!=  null)queue.add(curr.left);
                if (curr.right!=  null)queue.add(curr.right);
                
            }
            result.add(currlevel);
            ziz= !ziz;
        }
        return result ;


    }
}