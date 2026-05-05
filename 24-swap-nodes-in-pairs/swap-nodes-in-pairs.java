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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        if(temp==null || temp.next==null) return head;
         ListNode newNode=temp.next;
        ListNode prev=swapPairs(newNode.next);

        temp.next=prev;
        newNode.next=temp;
        return newNode;
         
    }
}