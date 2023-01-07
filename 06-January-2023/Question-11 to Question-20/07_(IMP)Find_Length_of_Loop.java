class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        
        Node slow=head;
        Node fast=head;
        
        int c=0;
        
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow){
                slow=head;
                
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                c=1;
                Node temp =slow.next;
                while(temp!=slow){
                    c++;
                    temp=temp.next;
                }
                return c;
            }
            
        }
        return c;
    }
}
