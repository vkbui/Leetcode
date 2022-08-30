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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode dummyHead = new ListNode(0); // keeps head of LL
        dummyHead.next = head;
        ListNode fast = head.next;
        ListNode slow = head;
        
        while (fast != null) {
            if (fast.val == slow.val) { // checks if same
                slow.next = fast.next; // skips duplicate node
                fast = fast.next; // only increments fast
            }
            else {
                slow = slow.next; // increment both
                fast = fast.next;
            }
        }
        
        return dummyHead.next;
    }
}