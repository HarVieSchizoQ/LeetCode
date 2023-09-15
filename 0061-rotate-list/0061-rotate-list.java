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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        
        ListNode left = head, right = head;
        
        k = k % length(head);
        
        if (k == 0)
            return head;
        
        while (k > 0 && right != null) {
            right = right.next;
            k--;
        }
        
        while (right != null && right.next != null) {
            left = left.next;
            right = right.next;
        }
        
        ListNode prevHead = head;
        head = left.next; 
        left.next = null;
        
        if (prevHead != null && right != null)
            right.next = prevHead;
        
        return head;
        
    }
    
    public int length(ListNode head) {
        int size = 0;
        ListNode temp = head;
        
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }
}

