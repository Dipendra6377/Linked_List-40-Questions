

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head,slow=head,temp,prev;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        prev=slow;
        slow=slow.next;
        prev.next=null;

        while(slow!=null){
            temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        fast=head;
        slow=prev;
        while(slow!=null){
            if(fast.val!=slow.val) return false;
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
}
//EXPLAINATION
//https://leetcode.com/problems/palindrome-linked-list/solutions/1137027/js-python-java-c-easy-floyd-s-reversal-solution-w-explanation/

//2nd

class Solution {
    public boolean isPalindrome(ListNode head) 
    {
       List<Integer>  values=new ArrayList<Integer>();
       ListNode tmp=head;

       while(tmp.next!=null)
       {
           values.add(tmp.val); //store values in ArrayList
           tmp=tmp.next;
       }
       values.add(tmp.val);

        int n=values.size();
       for(int i=0; i<(n/2); i++) // check that values are palindrome or not
       {
           if(values.get(i)!=values.get(n-i-1))
            return false;
       }

       return true;
    }
}
