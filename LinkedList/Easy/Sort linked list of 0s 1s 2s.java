import java.util.Arrays;

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution
{
    public static Node sortList(Node head) {
        // Write your code here
        int[] arr=new int[3];
        Arrays.fill(arr,0);
        Node current=head;
        while(current!=null){
            arr[current.data]++;
            current=current.next;
        }
        current=head;
        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i];j++){
                current.data=i;
                current=current.next;
            }
        }
        return head;
    }
}
