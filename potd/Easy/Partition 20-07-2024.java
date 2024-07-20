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
        Node lessThanX = new Node(0);

        Node greaterThanX = new Node(0);

        Node lessThanXTail = lessThanX;

        Node greaterThanXTail = greaterThanX;

        

        while (head != null) {

            if (head.data < X) {

                lessThanXTail.next = head;

                lessThanXTail = lessThanXTail.next;

            } else {

                greaterThanXTail.next = head;

                greaterThanXTail = greaterThanXTail.next;

            }

            head = head.next;

        }

        

        greaterThanXTail.next = null;  // set end of greaterThanX list to null

        lessThanXTail.next = greaterThanX.next;  // append greaterThanX list to lessThanX list

        

        return lessThanX.next;
    }
}
