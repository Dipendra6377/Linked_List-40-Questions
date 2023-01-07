//2<->2<->10<->8<->4<->2<->5<->2
//2
//Output: 10<->8<->4<->5


class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        if(head==null) return null;
        if(head.data==x)  head=head.next;
        Node curr=head;
        
        
        while(curr!=null){
            
            if(curr.data==x){
              if(curr.next!=null){
                  curr.next.prev=curr.prev;
              }
              if(curr.prev!=null){
                  curr.prev.next=curr.next;
              }
            }
            curr=curr.next;
        }
        return head;
    }
}
