class Solution {
    public ListNode reverse(ListNode head,int k,int length){
        if(length<k){
            return head;
        }
        int count=0;

        ListNode curr=head,prev=null,next=null;

        while(count<k && curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            head.next = reverse(next,k,length-count);
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        int length=0;
        while(curr!=null){
            curr=curr.next;
            length++;
        }

        return reverse(head,k,length);

    }
}
