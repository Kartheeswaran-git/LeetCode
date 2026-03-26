// Last updated: 26/03/2026, 16:17:31
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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null ||head==null)
            return null;
        ListNode f=head;
        ListNode s=head;
        ListNode temp=null;
        while(f!=null && f.next!=null)
        {
            temp=s;
            s=s.next;
            f=f.next.next;
        }
        temp.next=s.next;
        return head;
    }
}