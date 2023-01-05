//GFG  head is given

class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
	    Node curr=head;
	    if(x==1){
	        return head=curr.next;
	    }
	    for(int i=0;i<x-2;i++){
	        
	            curr=curr.next;

	    }
	    curr.next=curr.next.next;
	    return head;
    }
}

//Leetcode (head not given)


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
