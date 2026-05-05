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
       if(head==null || k==0) return head;
        ListNode temp=head;
        int len=1;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        
        
        k=k%len;
        if(k==0) return head;
        temp.next=head;
        temp=head;
        int i=1;
        while(i<len-k){
            temp=temp.next;
            i++;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}