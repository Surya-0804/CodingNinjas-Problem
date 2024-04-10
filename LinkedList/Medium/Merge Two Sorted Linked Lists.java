import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        if(first==null && second==null)
            return null;
        if(first==null)
            return second;
        if(second==null)
            return second;
        LinkedListNode dummy=new LinkedListNode(-1);
        LinkedListNode current=dummy; 

        while(first!=null && second!=null){
            if(first.data<=second.data){
                current.next=first;
                first=first.next;
            }
            else{
                current.next=second;
                second=second.next;
            }
            current=current.next;
        }
        if(first!=null)
            current.next=first;
        else
            current.next=second;
        return dummy.next;
	}
}
