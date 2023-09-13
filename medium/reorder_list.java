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
    public void reorderList(ListNode head) {
        // get to middle of LL using slow/fast method
        ListNode mid = head;
        ListNode end = head;
        while (end != null && end.next != null) {
            mid = mid.next;
            end = end.next.next;
        }

        // reverse second half of LL
        ListNode dummyMid = mid.next;
        ListNode prev = null;
        mid.next = null;
        while (dummyMid != null) {
            ListNode temp = dummyMid.next;
            dummyMid.next = prev;
            prev = dummyMid;
            dummyMid = temp;
        }

        // reassign pointers to match pattern
        // iterating through first and second half at same time
        dummyMid = prev;
        ListNode dummyHead = head;
        while (dummyMid != null) {
            ListNode temp1 = dummyHead.next;
            ListNode temp2 = dummyMid.next;
            dummyHead.next = dummyMid;
            dummyMid.next = temp1;
            dummyHead = temp1;
            dummyMid = temp2;
        }
    }
}