// Last updated: 15/06/2026, 16:27:13
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteMiddle(ListNode head) {
13        if(head==null || head.next==null)
14        return head.next;
15        ListNode s=head;
16        ListNode f=head.next.next;
17        while(f!=null && f.next!=null )
18        {
19            s=s.next;
20            f=f.next.next;
21        }
22        s.next=s.next.next;
23        return head;
24    }
25}