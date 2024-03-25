import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		LinkedListNode prev=null;
		LinkedListNode current=head;
		LinkedListNode nextNode;
		while(current!=null){
			nextNode=current.next;
			current.next=prev;
			prev=current;
			current=nextNode;
		}
		return prev;
    }
}
