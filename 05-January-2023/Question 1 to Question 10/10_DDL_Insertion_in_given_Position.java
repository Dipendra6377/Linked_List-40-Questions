void addNode(Node head, int pos, int data)
	{
		// Your code here
		Node curr=head;
		Node temp =new Node(data);
		if(head==null){
		    head=temp;
		    return;
		}
		
		for(int i=0;i<pos;i++){
		    curr=curr.next;
		}
		
		temp.next=curr.next;
		curr.next=temp;
		temp.prev=curr;
		
		return;
	}
}
