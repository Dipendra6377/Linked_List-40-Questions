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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }

        if(head.next.next==null){
            head.next=null;
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;
        while(fast!=null && fast.next!=null){
            temp=slow;
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode next=slow.next;
        temp.next=next;

        return head;

    }
}




//Altenate solution
//[1,3,4,7,1,2,6]


class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head.next==null)
        {
            return null;
        }
        if(head.next.next==null)
        {
           head.next=null;
            return head;
        }
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;    //slow =7
        }
        slow.val=slow.next.val;      //  1->3->4->1->1->2->6
        slow.next=slow.next.next;    //  1->3->4->1->2->6
        return head;
    }
}

