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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        // writer kushagra gupta - 19 jan 2023
        
        
        // Simple linked list question to involve
        
        // using map and hashmap also we can do.
        
        // No need to worry and check.
//         ListNode temp = new ListNode();
//         ListNode curr = temp;
        
        
//         int carry=0;
        
//         while(l1!=null||l2!=null){
//             int x = (l1!=null)?l1.val:0;
//             int y = (l2!=null)?l2.val:0;
//             int sum=carry+x+y;
//             carry = sum/10;
//            curr.next =new ListNode(sum%10);
//             curr = curr.next;
//             if(l1!=null) l1 = l1.next;
//             if(l2 !=null)  l2 = l2.next;
            
            
            
            
            
//         }
//         if(carry>0){
//             curr.next=new ListNode(carry);
//         }
         
//         return temp.next;
        
        int carry =0;
        
        ListNode temp = new ListNode(0);
        ListNode curr=temp;
        while(l1!=null || l2!=null){
            int a = (l1!=null)?l1.val:0;
            int b = (l2!=null)?l2.val:0;
            int sum = a+b+carry;
            carry = sum/10;
             curr.next  =new ListNode(sum%10);
            curr = curr.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null)l2 = l2.next;
        
        }
        if(carry>0){
            curr.next = new ListNode(carry);
            curr = curr.next;
            
        }
        return temp.next;
    }}
