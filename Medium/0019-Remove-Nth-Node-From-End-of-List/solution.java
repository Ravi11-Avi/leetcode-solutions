// ═══════════════════════════════════════════════════════
//  Problem  : 0019. Remove Nth Node From End of List
//  URL      : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.7 MB
//  Solved   : September 11, 2026
// ═══════════════════════════════════════════════════════

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy =  new ListNode(0);
        dummy.next  =  head;

        ListNode first =  dummy;
        ListNode sec =  dummy;

        for(int i = 0 ; i<n ; i++){
            first =  first.next;
        }

        while (first.next!= null){
            first =  first.next;
            sec =  sec.next;

        }

        sec= sec.next.next;

        return dummy.next;

    }
}