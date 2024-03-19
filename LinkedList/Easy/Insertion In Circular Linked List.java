import java.util.* ;

import java.io.*; 
/*
    Time Complexity : O(K)
    Space Complexity : O(1)

    Where, K is the position of the node to be inserted in the list.
*/

/************************************************************

 Following is the linkedList class structure:

 class Node<T> {
 T data;
 Node<T> next;

 public Node(T data) {
 this.data = data;
 }
 }

 ************************************************************/

public class Solution {

    static Node insert(int k, int val, Node head) {
        // Write your code here.
        Node newNode=new Node(val);
        if(k==0){
            Node current=head;
            while(current!=null&&current.next!=head){
                current=current.next;
            }
            newNode.next=head;
            head=newNode;
            current.next=head;
            return head;
        }
        Node prev=null;
        Node temp=head;
        for(int i=0;i<k;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=newNode;
        newNode.next=temp;
        return head;
        
    }
}
