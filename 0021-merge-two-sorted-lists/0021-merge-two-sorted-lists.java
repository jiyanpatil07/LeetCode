class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); 
        ListNode prev = dummy;
        ListNode first = list1;
        ListNode second = list2;
        
        while (first != null && second != null) {
            if (first.val < second.val) {
                prev.next = first;
                first = first.next;
            } else {
                prev.next = second;
                second = second.next;
            }
            
            prev = prev.next;
        }
        
       
        if (first != null) {
            prev.next = first;
        }
        
        if (second != null) {
            prev.next = second;
        }
        
        return dummy.next; 
    }
}
