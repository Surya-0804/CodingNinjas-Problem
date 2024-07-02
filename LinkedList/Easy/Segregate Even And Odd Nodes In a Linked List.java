import java.util.ArrayList;

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
 }

 *****************************************************************/

public class Solution
{
    public static Node segregateEvenOdd(Node head)
    {
        // Write Your Code Here.
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            if(temp.data %2==0)
                even.add(temp.data);
            else
                odd.add(temp.data);
            temp=temp.next;
        }
        temp=head;
        for(int i=0; i<even.size() && temp!=null; i++){
            temp.data=even.get(i);
            temp=temp.next;
        }
        for(int i=0; i<odd.size() &&temp!=null ; i++){
            temp.data=odd.get(i);
            temp=temp.next;
        }
        return head;
    }
}
