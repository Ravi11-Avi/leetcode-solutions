// ═══════════════════════════════════════════════════════
//  Problem  : 0141. Linked List Cycle
//  URL      : https://leetcode.com/problems/linked-list-cycle/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.5 MB
//  Solved   : September 11, 2026
// ═══════════════════════════════════════════════════════

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null)return false;
        ListNode first  =  head ;
        ListNode second  =  head ;

        while ( second.next !=null && second !=  null){
            first = first.next.next;
            second = second.next;

            if (second == first){
                return true ;
            }
        }

        return false;
    }
}