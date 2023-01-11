// Naive Approach

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map= new HashMap<>();
        Node temp = head;

        while(temp!=null){
            Node val = new Node(temp.val);
            map.put(temp,val);
            temp=temp.next;
        }

        Node curr=head;

        while(curr!=null){
            Node node =map.get(curr);
            node.next = (curr.next!=null)?map.get(curr.next):null;
            node.random = (curr.random!=null)?map.get(curr.random):null;
            curr=curr.next;
        }
        return map.get(head);
    }
}

//Optimised Approach

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;

        while(temp!=null){
            Node val = new Node(temp.val);
            val.next = temp.next;
            temp.next=val;
            temp=temp.next.next;
        }

        Node pointer = head;

        while(pointer!=null){
            if(pointer.random!=null){
                pointer.next.random=pointer.random.next;
            }
            pointer=pointer.next.next;
        }

        Node dummy = new Node(0);
        Node curr=head;
        Node node =dummy;
        Node nex=head;

        while(curr!=null){
            nex=curr.next.next;
            node.next=curr.next;
            curr.next=nex;
            node=node.next;
            curr=nex;
        }
        return dummy.next;
    }
}
