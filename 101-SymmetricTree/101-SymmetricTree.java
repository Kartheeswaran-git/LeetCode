// Last updated: 09/06/2026, 00:22:38
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isSymmetric(TreeNode root) {
18        if(root==null)
19        return true;
20        return mirror(root.left,root.right);
21    }
22    public boolean mirror(TreeNode l,TreeNode r)
23    {
24        if(l==null && r==null)
25        return true;
26        if(l==null || r==null)
27        return false;
28        if(l.val!=r.val)
29        return false;
30        return mirror(l.left,r.right) && mirror(l.right,r.left);
31    }
32}