class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(n==count){
            return head.next;
        }
        ListNode curr=head;

        for(int i=0;i<count-n-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;

        return head;
    }
}
