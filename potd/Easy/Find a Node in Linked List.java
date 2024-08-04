/****************************************************************

	Following is the class structure of the Node class:

	class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		Node current=head;

		for(int i=0; current!=null; i++){
			if(current.data.equals(n))
				return i;
			current=current.next;
		}
		return -1;
	}
}
