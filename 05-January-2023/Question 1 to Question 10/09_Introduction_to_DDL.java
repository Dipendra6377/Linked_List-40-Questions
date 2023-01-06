class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head=null;
        Node curr=new Node(arr[0]);
        head=curr;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            curr.next=temp;
            temp.prev=curr;
            curr=temp;
        }
        return head;
    }
}
