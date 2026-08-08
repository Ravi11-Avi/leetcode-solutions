// ═══════════════════════════════════════════════════════
//  Problem  : 0662. Maximum Width of Binary Tree
//  URL      : https://leetcode.com/problems/maximum-width-of-binary-tree/submissions/2099514696/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 1 ms
//  Memory   : 45.2 MB
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

    class Pair{
        TreeNode node;
        int idx;

        Pair(TreeNode node , int idx){
            this.node  = node;
            this.idx  = idx;
        }
    }
    
    public int widthOfBinaryTree(TreeNode root) {
        if (root== null) return 0;
        int maxWidth =  Integer.MIN_VALUE;

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        while(!queue.isEmpty()){
            int sizee =  queue.size();
            int levelMin =  queue.peek().idx;
            int first = 0 , last = 0;

            for (int i = 0 ; i <sizee ; i++){
                Pair currP = queue.poll();

                int currIndex =  currP.idx - levelMin;
                TreeNode node = currP.node;

                if (i==0) first =  currIndex;
                if (i==sizee-1) last =  currIndex;



                if (currP.node.left!= null)queue.offer(new Pair(node.left, 2 * currIndex + 1));
                if (currP.node.right!= null)queue.offer(new Pair(node.right, 2 * currIndex + 2));
            }
            maxWidth = Math.max(maxWidth, last-first+1);
        }


        return maxWidth;
    }
}