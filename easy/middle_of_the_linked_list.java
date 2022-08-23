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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) { // make sure fast is not skipping into nulls
            slow = slow.next; // slow moves by 1
            fast = fast.next.next; // fast moves by 2
        }
        
        // when fast reaches end, slow will be at middle
        return slow;
        
// one method - traverse whole list and divide by 2
//         int length = 0;
//         ListNode ogHead = head; // temp var to keep location of head
        
//         while (ogHead != null) { // gets number of nodes in LL
//             ogHead = ogHead.next;
//             length += 1;
//         }
        
//         for (int i = 0; i < length / 2; i += 1) { // move head to middle of LL
//             head = head.next;
//         }
        
//         return head;
    }
}