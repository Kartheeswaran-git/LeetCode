// Last updated: 26/03/2026, 16:22:37
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
    public boolean hasPathSum(TreeNode root, int t) {
        return dfs(root,0,t);
    }
    public boolean dfs(TreeNode r, int sum,int t)
    {
        if(r==null)
        return false;
        if(r.left==null && r.right==null)
        return sum+r.val==t;
        sum+=r.val;
        return dfs(r.left,sum,t)||dfs(r.right,sum,t);
    }
}