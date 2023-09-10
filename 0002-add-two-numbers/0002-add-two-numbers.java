/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     long val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(long val) { this.val = val; }
 *     ListNode(long val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0, l1);
        ListNode point = dummy;
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int sum = carry;
            
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;   
            }
            
            int digit = sum % 10;
            carry = sum / 10;
            
            point.next = new ListNode(digit);
            point = point.next;
        }
        
        if (carry > 0) point.next = new ListNode(carry);
        
        return dummy.next;
    }
}
