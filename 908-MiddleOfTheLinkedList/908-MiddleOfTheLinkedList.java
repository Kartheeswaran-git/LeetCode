// Last updated: 26/03/2026, 16:18:24
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
    public ListNode middleNode(ListNode head) {
        ListNode single=head;
        ListNode doublee=head;
        while(doublee!=null && doublee.next!=null)
        {
            single=single.next;
            doublee=doublee.next.next;
        }
        return single;
    }
}