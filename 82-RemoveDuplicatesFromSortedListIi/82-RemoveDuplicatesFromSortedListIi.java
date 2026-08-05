// Last updated: 05/08/2026, 10:32:04
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        ListNode prev = head;
        while (prev != null) {
            if (prev.next != null && prev.val == prev.next.val) {
                int val = prev.val;
                while (prev != null && prev.val == val) {
                    prev = prev.next;
                }
                temp.next = prev;
            } else {
                temp = prev;
                prev = prev.next;
            }
        }
        return dummy.next;
    }
}