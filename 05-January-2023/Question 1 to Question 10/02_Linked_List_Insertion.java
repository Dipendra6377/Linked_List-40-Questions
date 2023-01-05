class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        Node temp=new Node(x);
        if(head ==null){
            temp.next=head;
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node temp=new Node(x);
        if(head==null){
            temp.next=null;
            head=temp;
        }
        Node dummy =head;
        while(dummy.next!=null){
            dummy=dummy.next;
        }
        dummy.next=temp;
        temp.next=null;
        
        return head;
    }
}
