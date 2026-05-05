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
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right) return head;
        ListNode prev=null;
        ListNode curr=null;
        ListNode terminate=null;
  
        ListNode temp=head;
      
        for(int i=1;i<=right;i++){
             if(i==left-1){
                prev=temp;
             }
             if(i==left){
                curr=temp;
             }
             if(i==right){
                terminate=temp.next;
             }
             temp=temp.next;
        }
      
       ListNode l=prev;
       ListNode r=curr;
        ListNode p=null;   
        ListNode next=null;
        
        while(curr!=terminate){
            next=curr.next;
            curr.next=p;
            p=curr;
            curr=next;
        }
      
       if (l != null) l.next = p;
        else head = p;

        r.next = terminate;

        return head;
    }
}