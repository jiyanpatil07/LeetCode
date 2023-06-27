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
    public ListNode reverseList(ListNode head) {
      
        
        ListNode newNode=null;
        while(head!=null){
            
            ListNode newnode=head.next;
            head.next=newNode;
            newNode=head;
            head=newnode;
            
        }
        return newNode;
}
}