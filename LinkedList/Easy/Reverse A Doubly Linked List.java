/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node reverseDLL(Node head)
    {
        // Write your code here.
        if(head==null ||head.next==null)
            return head;
        Node temp=head;
        while(head.next!=null){
            temp=head.next;
            head.next=head.prev;
            head.prev=temp;
            head=head.prev;
        }
        head.next=head.prev;
        head.prev=null;
        return head;
    }
}
