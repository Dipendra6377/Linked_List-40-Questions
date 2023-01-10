class GfG
{
    void removeDuplicates(Node head)
	{
		// Your code here
		Node temp=head;
		Node curr=head;
		
		while(temp!=null){
		    if(temp.data==curr.data){
		        temp=temp.next;
		    }
		    else{
		        curr=curr.next;
		        curr.data=temp.data;
		    }
		}
		curr.next=null;
	}
}
