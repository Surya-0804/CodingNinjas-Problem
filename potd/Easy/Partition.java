import java.util.* ;


import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       	class Node {
    	int data;
    	Node next;

    	Node(int x) {
        	this.data = x;
        	this.next = null;
    	}
};

*****************************************************************/

public class Solution {
    public static Node findPartition(Node head, int X) {
        // Write your code here.
		if(head == null || head.next==null)
			return head;

        Node lessHead=new Node(0);
		Node greaterHead=new Node(0);
		Node less=lessHead;
		Node greater=greaterHead;

		Node temp=head;
		while(temp!=null){
			if(temp.data>=X){
				greater.next=temp;
				greater=greater.next;
			}
			else{
				less.next=temp;
				less=less.next;
			}
			temp=temp.next;
		}
		greater.next=null;
		less.next=greaterHead.next;
		
		return lessHead.next;
    }
}
