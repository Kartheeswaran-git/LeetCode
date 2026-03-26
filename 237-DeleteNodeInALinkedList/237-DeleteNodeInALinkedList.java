// Last updated: 26/03/2026, 16:21:04

//  * Definition for singly-linked list.
//  * public class ListNode
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) { val = x; }
//  * }

class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        
    }
}