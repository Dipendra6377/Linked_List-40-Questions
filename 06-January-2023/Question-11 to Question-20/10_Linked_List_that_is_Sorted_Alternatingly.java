//https://practice.geeksforgeeks.org/problems/linked-list-that-is-sorted-alternatingly/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-that-is-sorted-alternatingly

class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        if(head ==null || head.next==null){
            return head;
        }
        
        Node inc =head;
        Node dec =head.next;
        Node dechead=dec;
        
        while(inc.next!=null && dec.next!=null){
            inc.next=dec.next;
            inc= inc.next;
            
            dec.next=inc.next;
            dec=dec.next;
        }
        inc.next=null;
        
       Node prev=null,curr=dechead;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        
        dechead=prev;
        
        
        return merge(head,dechead);
   }
   
   public Node merge(Node l1,Node l2){
       Node dummy = new Node(-1);
       Node temp=dummy;
       
       while(l1!=null && l2!=null){
           if(l1.data<=l2.data){
               temp.next=l1;
               l1=l1.next;
           }
           else{
               temp.next=l2;
               l2=l2.next;
           }
           temp=temp.next;
       }
       if(l1!=null){
           temp.next=l1;
       }
       if(l2!=null){
           temp.next=l2;
           
       }
       return dummy.next;
           
   }


}
