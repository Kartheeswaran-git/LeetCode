// Last updated: 26/03/2026, 16:17:57
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
    public int getDecimalValue(ListNode head) {
    ListNode temp=head;
    // int len=0;
    // while(temp!=null)
    // {
    //     len++;
    //     temp=temp.next;
    // }
    // int mul=(int)Math.pow(2,len-1);
    int n=0;
    temp=head;
    while(temp!=null)
    {
        // n+=(temp.val*mul);
        // mul/=2;
        n=n*2+temp.val;
        temp=temp.next;
    }
     return n;
    }
}