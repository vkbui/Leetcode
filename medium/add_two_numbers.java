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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0); // keeps the head of the linked list
        ListNode curr = result; // curr used to iterate
        int carry = 0;
        
        // if lists are empty, return other list
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0; // if l1 is null, = 0, else, = l1.val
            int y = (l2 != null) ? l2.val : 0; // if l2 is null, = 0, else, = l2.val
            
            int sum = x + y + carry;
            carry = sum / 10; // get carry to add to next loop
            curr.next = new ListNode(sum % 10); // put sum in node of result LL
            curr = curr.next; // iterate to next node
            
            // iterate through two given nums
            if (l1 != null) {
                l1 = l1.next; 
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return result.next;
    }
}
