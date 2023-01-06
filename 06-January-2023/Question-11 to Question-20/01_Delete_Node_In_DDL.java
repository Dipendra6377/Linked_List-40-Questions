class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	// Your code here	
	    if(x==1){
	        head= head.next;
	        head.prev=null;
	        return head;
	    }
	    Node curr=head;
	    
	    for(int i=1;i<x-1;i++ ){
	        curr=curr.next;
	    }
	    if(curr.next.next==null){
	        curr.next=null;
	        return head;
	    }
	        curr.next=curr.next.next;
	        curr.next.prev=curr;
	        
	    return head;
    }
}
