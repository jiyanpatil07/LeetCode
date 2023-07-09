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
    public int getDecimalValue(ListNode head) {
      StringBuilder binaryString= new StringBuilder();
            while(head!=null){
            
            binaryString.append(head.val);
            head=head.next;
        }
        // System.out.println(list);
        // int number=0;
        // //  for (int digit : list) {
        // //     number = number * 10 + digit;
        // // }
        // for(int i=0;i<list.size();i++){
        //     number = number*10 + list.get(i);
        // }
        int decimal = Integer.parseInt(binaryString.toString(), 2);

        return decimal;
    }
}