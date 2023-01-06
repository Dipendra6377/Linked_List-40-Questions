class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode NewHead = reverseList(head.next);
        ListNode next =head.next;
        next.next=head;
        head.next=null;

        return NewHead;
        
    }
}

//https://www.youtube.com/watch?v=ugQ2DVJJroc
