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
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) { // make sure fast is not skipping into nulls
            slow = slow.next; // slow moves by 1
            fast = fast.next.next; // fast moves by 2
            
            // fast will eventually catch up to slow if there is a loop
            if (slow == fast) {
                return true;
            }
        }
        
        return false;
    }
}