/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
//         if(head==null){
//             return null;
            
//         }
                                              
//         prevNode = new ListNode(0);
//           prevNode.next = head;
//      newHead = prevNode();
//         while(prevNode.next!=null && prevNode.next.next!=null){
            
//             node1= prevNode.next;
//             node2 = node1.next;
//             nextNode = node2.next;
//             prevNode.next = node2;
//             node2.next=node1;
//             node1.next=nextNode;
//             prevNode=node1;
//         }
//         return newHead.next;
                                             
                                  
        if(head==null || head.next==null){
            return head;
        }
       ListNode p1=head;
       ListNode p2=head.next;
      ListNode  p3=p2.next;
        p1.next=p3;
        p2.next=p1;
        if(p3!=null){
            p1.next=swapPairs(p3);
            
        }
        return p2;
    }
}