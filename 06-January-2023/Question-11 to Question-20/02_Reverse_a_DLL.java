class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

*/
public static Node reverseDLL(Node  head)
{
    //Your code here
    if(head==null || head.next==null){
        return head;
    }
    
    Node temp=null;
    
    while(head!=null ){
        Node next=head.next;
        head.next=temp;
        head.prev=next;
        temp=head;
        head=next;
    }
    return temp;
}
