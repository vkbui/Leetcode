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
        
        ListNode dummyHead = new ListNode(); // keeps head of LL
        dummyHead.next = head;
        ListNode fast = dummyHead.next.next; // fast is 2 nodes ahead of slow
        ListNode slow = dummyHead;
        
        while (fast != null) {
            if (fast.val == slow.next.val) { // checks if same
                while (fast.next != null && fast.val == fast.next.val) { // iterates to last duplicate node
                    fast = fast.next;
                }
                
                if (fast.next == null) { // if last node in LL is a duplicate
                    slow.next = fast.next;
                    return dummyHead.next;
                }
                
                // else
                slow.next = fast.next; // skip over duplicate nodes
                fast = fast.next.next; // increment fast 2 nodes to stay ahead of slow
            }
            else {
                slow = slow.next; // increment both
                fast = fast.next;
            }
        }
        
        return dummyHead.next;
    }
}