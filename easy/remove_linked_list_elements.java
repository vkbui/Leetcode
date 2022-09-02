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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0); // keep head of LL     
        dummyHead.next = head;
        ListNode curr = dummyHead;
        
        if (head == null) { // empty
            return head;
        }
        
        while (curr.next != null) {
            if (curr.next.val == val) { // check if same value
                curr.next = curr.next.next; // skip over desired element
            }
            else {
                curr = curr.next; // increment
            }
        }
        
        return dummyHead.next;
    }
}