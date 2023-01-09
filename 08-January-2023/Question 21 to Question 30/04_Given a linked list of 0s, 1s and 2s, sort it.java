class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node temp=head;
        int count0=0;int count1=0; int count2=0;
        while(temp!=null){
            if(temp.data==0){
                count0++;
            }
            else if(temp.data==1){
                count1++;
            }
            else{
                count2++;
            }
            temp=temp.next;
        }
        Node dummy = head;
        int count=0;
        while(dummy!=null){
            count+=1;
            
            if(count<=count0){
                dummy.data=0;
            }
            else if(count<=count0+count1){
                dummy.data=1;
            }
            else{
                dummy.data=2;
            }
            dummy=dummy.next;
        }
        return head;
        
    }
}
