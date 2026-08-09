// ═══════════════════════════════════════════════════════
//  Problem  : 0103. Binary Tree Zigzag Level Order Traversal
//  URL      : https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.7 MB
//  Solved   : August 9, 2026
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
        
        List<List<Integer>> ans =  new ArrayList<>();

        if (root== null) return ans ;
        Boolean zz =  true;

        Queue<TreeNode> queue =  new LinkedList<>();
        queue.offer(root);

        while (queue.isEmpty()){
            int size = queue.size();
            List<Integer> rn =  new ArrayList<>();

            if (zz){
                for(int i = 0; i < size  ; i++){
                    TreeNode curr = queue.poll();
                    rn.add(curr.val);

                    if(curr.left != null)queue.offer(curr.left); 
                    if(curr.right != null)queue.offer(curr.right); 
                }
                ans.add(new ArrayList<>(rn));

                zz= false;
            }else{
                for(int i = size-1; i >=0  ; i--){
                    TreeNode curr = queue.poll();
                    rn.add(curr.val);

                    if(curr.left != null)queue.offer(curr.left); 
                    if(curr.right != null)queue.offer(curr.right); 
                }
                ans.add(new ArrayList<>(rn));

                zz= true;

            }
        }

        return ans;
    }
}