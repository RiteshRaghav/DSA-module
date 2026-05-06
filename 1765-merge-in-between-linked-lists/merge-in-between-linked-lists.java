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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode first=null;
        ListNode second=null;
        int cnt=1;
        while(cnt<=b){
            if(cnt==a){
                first=temp;
            }
            temp=temp.next;
            cnt++;
        }
        second=temp.next;

        ListNode temp2=list2;
        first.next=list2;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=second;
        return list1;
    }
}