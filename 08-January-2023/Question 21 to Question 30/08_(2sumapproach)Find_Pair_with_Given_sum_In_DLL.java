class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Node left=head;
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node right=temp;
        
        while(left !=null && right!=null && left.data<right.data){
            int sum=left.data+right.data;
            
            if(sum==target){
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(left.data);
                ans.add(right.data);
                res.add(ans);
                left=left.next;
                right=right.prev;
            }
            else if(sum>target){
                right=right.prev;
            }
            else{
                left=left.next;
            }
        }
        return res;
    }
}
        
