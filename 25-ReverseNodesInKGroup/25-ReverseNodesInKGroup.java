// Last updated: 26/03/2026, 16:25:01
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode temp = head;
        ListNode t = head;
        Stack<Integer> st = new Stack<>();

        while (true) {
            st.clear();
            int count = 0;

            while (temp != null && count < k) {
                st.push(temp.val);
                temp = temp.next;
                count++;
            }

            if (count < k) break;

            while (!st.isEmpty()) {
                t.val = st.pop();
                t = t.next;
            }
        }

        return head;
    }
}
