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
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null; 
        ListNode prev = null;
        ListNode next = null;
        
        while (head != null) {
            next = head.next; // store head.next to move head later
            head.next = prev; // points head.next backwards
            prev = head; // increment prev forward
            head = next; // increment head forward
        }
        
        newHead = prev; // head would be null
        return newHead;
    }
}