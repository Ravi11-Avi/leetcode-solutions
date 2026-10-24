// ═══════════════════════════════════════════════════════
//  Problem  : 0173. -
//  URL      : https://leetcode.com/problems/binary-search-tree-iterator/submissions/
//  Difficulty : Easy
//  Language : java
//  Solved   : October 24, 2026
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
class BSTIterator {
    
    private Stack<TreeNode> stack=  new Stack<>();

    public void leftnode(TreeNode node){
        while (node!= null){
            stack.push(node);
        node = node.left;
        }
        
    }
    public BSTIterator(TreeNode root) {
        leftnode(root);
    }
    
    public int next() {
        TreeNode curr  =  stack.peek();
        stack.pop();
        if (curr.right!=null)leftnode(curr.right);
        return curr.val;
    }
    
    public boolean hasNext() {
        return stack.size()>0;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */