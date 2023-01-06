class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }

        for(int i=0;i<count/2;i++){
                head=head.next;
        }
        return head;
    }
}
