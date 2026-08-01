// ═══════════════════════════════════════════════════════
//  Problem  : 0515. Find Largest Value in Each Tree Row
//  URL      : https://leetcode.com/problems/find-largest-value-in-each-tree-row/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 43.1 MB
//  Solved   : August 2, 2026
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
    public List<Integer> largestValues(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if (root== null) return result;

        Queue<TreeNode> queue =  new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int sizeQ =  queue.size();
            int max = Integer.MIN_VALUE ;

            for(int i =  0 ;  i < sizeQ ; i++){
                TreeNode currentNode = queue.poll();
                if (currentNode.val> max)max = currentNode.val;

                if (currentNode.left!= null){
                    queue.add(currentNode.left);
                }
                if (currentNode.right!= null){
                    queue.add(currentNode.right);
                }
            }

            result.add(max);
        }
        return result ;
        
    }
}