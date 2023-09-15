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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                int val = current.val;
                while (current != null && val == current.val) {
                    current = current.next;
                }
                prev.next = current;
            } else {
                prev = prev.next;
                current = current.next;
            }
        }
        
        return dummy.next;
    }
}