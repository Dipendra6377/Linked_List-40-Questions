class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        Node curr=head;
        Node prev=null;
        
        while(curr!=null){
            Node next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        Node dummy = new Node(-1);
        Node temp=dummy;
        
        Node l1=prev;
        Node l2 =new Node(1);
        l2.next=null;
        
        int carry=0;
        while(l1!=null ||l2!=null || carry==1 ){
            int sum=0;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            
            carry=sum/10;
            
            Node node =new Node(sum%10);
            temp.next=node;
            temp=temp.next;
            
        }
        Node ans=dummy.next;
        Node rev=null;
        
        while(ans!=null){
            Node nex=ans.next;
            ans.next=rev;
            rev=ans;
            ans=nex;
        }
        
        return rev;
    }
}
