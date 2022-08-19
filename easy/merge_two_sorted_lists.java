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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0); // keeps the head of the linked list
        ListNode dummy = dummyHead; // dummy linked list to add to
        
        // if lists are empty, return other list
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        
        // 
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) { // compares values
                dummy.next = list1; // adds node to dummy
                list1 = list1.next; // increments to next node in list1
            }
            else if (list1.val > list2.val) {
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy = dummy.next; // increments to next node in dummy
        }
        
        // if one list finishes before other, add rest of nodes from other list
        if (list1 == null) {
            dummy.next = list2;
        }
        else {
            dummy.next = list1;
        }
        return dummyHead.next; // returns the NEXT of the dummy head, or, dummy after being built
    }
}