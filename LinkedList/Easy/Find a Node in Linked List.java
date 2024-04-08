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
		int index=0;
		while(head!=null){
			if(head.data==n)
				return index;
			index++;
			head=head.next;
		}
		return -1;
	}
}
