// ═══════════════════════════════════════════════════════
//  Problem  : 0116. Populating Next Right Pointers in Each Node
//  URL      : https://leetcode.com/problems/populating-next-right-pointers-in-each-node/submissions/2099413443/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 3 ms
//  Memory   : 46.4 MB
//  Solved   : August 8, 2026
// ═══════════════════════════════════════════════════════

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root== null) return null;

        Queue<Node> queue =  new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int sizee =  queue.size();

            for (int i = 0  ;  i < sizee ; i++){
                Node curr  = queue.poll();

                if(i< sizee-1){
                    curr.next  =  queue.peek();
                }


                if (curr.left!=  null)queue.offer(curr.left);
                if (curr.right!=  null)queue.offer(curr.right);
            }
        }
        return root;

    }
}