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
    public boolean isPalindrome(ListNode head) {
        ListNode dummyHead = head;
        int length = 0;
        while (dummyHead != null) { // find length of LL
            length += 1;
            dummyHead = dummyHead.next;
        }
        
        int[] nums = new int[length]; // put values of LL into array
        int index = 0;
        while (head != null) {
            nums[index] = head.val;
            index += 1;
            head = head.next;
        }
        
        // compares first and last elements and increments towards middle of array
        for (int i = 0; i < length / 2; i += 1) { 
            if (nums[i] != nums[length - i - 1]) { // checks if not matching
                return false;
            }
        }
        return true;
    }
}