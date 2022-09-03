/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode a = headA;
        ListNode b = headB;
        
        // In the first iteration, we will reset the pointer of one linkedlist to the head of another LL after it reaches the tail node. In the second iteration, we will move two pointers until they points to the same node. Meeting point of pointers is the intersection.
        while (a != b) {
            if (a == null) {
                a = headB;
            }
            else {
                a = a.next;
            }
            
            if (b == null) {
                b = headA;
            }
            else {
                b = b.next;
            }
        }
        return a;
    }
}