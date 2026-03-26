// Last updated: 26/03/2026, 16:21:27
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
//     public ListNode removeElements(ListNode head, int val) {
//         if(head==null || (head.next==null && head.val!=val))
//             return head;
//         while(head.val==val)
//         {
//             head=head.next;
//             if(head==null)
//                 return head;
//         }
//         ListNode temp=head;
//         if(temp.next==null)
//         {
//             return head;
//         }
//         if(temp.next.val==val)
//             temp.next=temp.next.next;
//         while(temp.next.next!=null )
//         {
//             if(temp.next.val==val)
//                 temp.next=temp.next.next;
//             temp=temp.next;
//         }
//         if(temp.next.val==val)
//             temp.next=null;
//         return head;
        
//     }
public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
}
}