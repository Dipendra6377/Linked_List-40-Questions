// 1st solution

class Solution {
    static Node constructLL(int arr[]) {
        // code here
        Node head = null;
        Node cur = new Node();
        cur.data = arr[0];
        cur.next = null;
        head = cur;
        for (int i = 1; i < arr.length; i++) {
            Node tmp = new Node();
            tmp.data = arr[i];
            tmp.next = null;
            cur.next = tmp;
            cur = tmp;
        }
        return head;
    }
}


// 2nd solution


class Solution {
    static Node constructLL(int arr[]) {
        // code here
        Node head=null;
        Node last = null;
        
        for(int i=0;i<arr.length;i++){
            if(head==null){
                head=new Node(arr[i]);
                last=head;
            }
            else{
                last.next=new Node(arr[i]);
                last=last.next;
            }
        }
        return head;
    }
}
