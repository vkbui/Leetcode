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
        ListNode start = new ListNode(0); // keeps head of LL
        start.next = head;
        ListNode fast = start; 
        ListNode slow = start;
        
        for (int i = 1; i <= n + 1; i += 1) { // iterates fast to given n
            fast = fast.next;
        }
        
        while (fast != null) { // when fast reaches end, slow will reach the node to be removed
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next; // skip desired node
        return start.next;
    }
}