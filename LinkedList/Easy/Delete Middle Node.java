/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node deleteMiddle(Node head) {
        // Write your code here.
        int len=0;
        Node current=head;
        while(current!=null){
            current=current.next;
            len++;
        }
        if(len ==1)
            return null;
        current=head;
        Node prev=null;
        for(int i=0 ; i< len/2 ; i++){
            prev=current;
            current=current.next;
        }
        prev.next=current.next;
        return head;


    }
}
