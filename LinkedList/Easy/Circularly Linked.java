import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
        {
        public:
            int data;
            Node *next;
            Node(int data)
            {
                this->data = data;
                this->next = NULL;
            }
        };

*****************************************************************/

public class Solution {
    
    public static boolean isCircular(Node<Integer> head) {
        // Write your code here.
        if(head == null)
            return true;
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                if(slow==head)
                    return true;
                else
                    return false;
            }
        }
        return false;
    }

}
