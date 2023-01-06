class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null){
           fast=fast.next.next;
           slow=slow.next;
        }
        return slow;
    }
}
