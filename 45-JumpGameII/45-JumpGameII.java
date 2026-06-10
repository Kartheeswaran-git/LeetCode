// Last updated: 11/06/2026, 00:41:59
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3
4        if (head == null) return null;
5        ListNode dummy = new ListNode(0);
6        dummy.next = head;
7        ListNode temp = dummy;
8        ListNode prev = head;
9        while (prev != null) {
10            if (prev.next != null && prev.val == prev.next.val) {
11                int val = prev.val;
12                while (prev != null && prev.val == val) {
13                    prev = prev.next;
14                }
15                temp.next = prev;
16            } else {
17                temp = prev;
18                prev = prev.next;
19            }
20        }
21        return dummy.next;
22    }
23}