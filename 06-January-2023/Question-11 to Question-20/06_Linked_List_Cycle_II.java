//  TC O(N)    SC O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next !=null){
            slow=slow.next;
            fast=fast.next.next;
                
            if(slow==fast){
                slow=head;

                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;

    }
}

// TC  0(N)    SC   O(N)

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        HashSet<ListNode> set=new HashSet<>();

        while(head!=null){
            if(set.contains(head)) return head;
            set.add(head);

            head=head.next;
        }
        return null;

    }
}
