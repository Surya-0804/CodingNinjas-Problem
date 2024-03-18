import java.util.HashSet;

/********************************************************

    Following is the class structure of the Node class:
    
    class Node
    {
        public:
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };

********************************************************/

public class Solution {
    public static Node uniqueSortedList(Node head) {
        // Write your code here.
        HashSet<Integer> set=new HashSet<>();
        Node prev=null;
        Node current=head;
        Node nextNode=null;
        while(current!=null){
            nextNode=current.next;
            if(set.contains(current.data)){
                prev.next=nextNode;
            }else{
                set.add(current.data);
                prev=current;
            }
            current=nextNode;
        }
        return head;
    }
}
