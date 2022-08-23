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
        int length = 0;
        ListNode ogHead = head; // temp var to keep location of head
        
        while (ogHead != null) { // gets number of nodes in LL
            ogHead = ogHead.next;
            length += 1;
        }
        
        for (int i = 0; i < length / 2; i += 1) { // move head to middle of LL
            head = head.next;
        }
        
        return head;
    }
}