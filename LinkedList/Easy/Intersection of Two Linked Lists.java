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

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        if (firstHead == null || secondHead == null) {
            return -1;
        }
        Node temp1=firstHead;
        Node temp2=secondHead;

       while (temp1 != temp2) {
            temp1 = (temp1 == null) ? secondHead : temp1.next;
            temp2 = (temp2 == null) ? firstHead : temp2.next;
        }
        return (temp1 != null) ? temp1.data : -1;
    }
}
