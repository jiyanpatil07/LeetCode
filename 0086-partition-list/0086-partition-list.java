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
     public ListNode partition(ListNode head, int x) {
  ListNode leftDummy = new ListNode(0); // Dummy node for the left side
        ListNode rightDummy = new ListNode(0); // Dummy node for the right side
        ListNode left = leftDummy;
        ListNode right = rightDummy;
        
        while (head != null) {
            if (head.val < x) {
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }
        
        right.next = null; // Set the next of the right side's end node to null
        left.next = rightDummy.next; // Connect the left side to the right side
        
        return leftDummy.next; // Return t
    }
}