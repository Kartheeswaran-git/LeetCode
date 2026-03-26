// Last updated: 26/03/2026, 16:21:56
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        pre(root,l);
        return l;
    }
    void pre(TreeNode root, List<Integer> l)
    {
        if(root==null)
        return ;
        l.add(root.val);
        pre(root.left,l);
        pre(root.right,l);
    }
}