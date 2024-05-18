import java.util.* ;
import java.io.*; 
/*************************
 * Following is the linked list node class
    class Node {
        
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            next = null;
        }
    }

 ***************/

public class Solution {

    public static Node intersect_ll(Node L1, Node L2) {
        
        // Write your Code here
        HashSet<Integer> set=new HashSet<>();
        while(L1!=null){
            set.add(L1.data);
            L1=L1.next;
        }
        Node newList=new Node(0);
        Node temp=newList;
        while(L2!=null){
            if(set.contains(L2.data)){
                temp.next=new Node(L2.data);
                temp=temp.next;
            }
            L2=L2.next;
        }
        return newList.next;
    }   
}
