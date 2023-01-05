class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node curr=head;
        for(int i=0;i<n;i++){
            
            if(curr!=null && curr.data==key){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
}
