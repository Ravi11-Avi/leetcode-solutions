// ═══════════════════════════════════════════════════════
//  Problem  : 0863. All Nodes Distance K in Binary Tree
//  URL      : https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 10 ms
//  Memory   : 42 MB
//  Solved   : November 3, 2026
// ═══════════════════════════════════════════════════════

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode , TreeNode > map =  new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res = new ArrayList<>();

        if (root == null) return res ;
        
        parrentfinder(root, null);

        Queue<TreeNode> q =  new LinkedList<>();
        ArrayList<TreeNode> visited =  new ArrayList<>();

        q.offer(target);
        visited.add(target);

        int currdis = 0;

        while(!q.isEmpty()){
            int size  =  q.size();
            if (currdis == k) {
                while (!q.isEmpty()) {
                    res.add(q.poll().val);
                }
                return res;
            }
            for(int i  = 0; i < size ; i++){
                TreeNode curr =  q.poll();
                
                if (curr.left!= null && !visited.contains(curr.left) ){
                    visited.add(curr.left);
                    q.offer(curr.left);
                }
                if (curr.right!= null && !visited.contains(curr.right) ){
                    visited.add(curr.right);
                    q.offer(curr.right);
                }

                TreeNode parent  = map.get(curr);
                if (parent!= null && !visited.contains(parent) ){
                    visited.add(parent);
                    q.offer(parent);
                }
            }
            currdis++; 
        }
        return res;
    }
    public void parrentfinder (TreeNode node , TreeNode parrent){
        if (node == null) return; 

        TreeNode curr =  node  ;
        map.put(node , parrent);
        parrentfinder(node.left, curr);
        parrentfinder(node.right, curr);
        return;
    }



}