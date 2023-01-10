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
        if(head==null || k==0 || head.next==null){
            return head;
        }
        ListNode temp=head;
        int size=0;

        while(temp!=null){
            temp=temp.next;
            size++;
        }

        k=k%size;

        ListNode curr=head;
        ListNode prev=null;

        while(k>0){
            while(curr.next!=null){
                prev=curr;
                curr=curr.next;
            }
            prev.next=null;
            curr.next=head;
            head=curr;

            k--;
        }
        return head;
    }
}
