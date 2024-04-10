/************************************************************************

    Following is the representation of the Singly Linked List node:

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

************************************************************************/

public class Solution {
    public static boolean detectCycle(Node<Integer> head) {
        // Write your code here.
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            if(slow==fast)
                return true;
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}
