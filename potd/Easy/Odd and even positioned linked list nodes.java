import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

	class Node {
	    public int value;
	    public Node next;

	    Node(int value) {
	        this.value = value;
	        this.next = null;
	    }
	}

*****************************************************************/

public class Solution {
	public static Node oddEvenLinkedList(Node head) {
		// Write your code here.
		if(head==null|| head.next==null){
			return head;
		}
		Node even=head.next;
		Node odd=head;
		Node temp=even;
		while(even!=null && even.next!=null){
			odd.next=odd.next.next;
			odd=odd.next;

			even.next=even.next.next;
			even=even.next;
		}
		odd.next=temp;
		return head;
	}
}
