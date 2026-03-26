// Last updated: 26/03/2026, 16:22:47
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
        return null;
        return helper(nums,0,nums.length -1);
        
    }
    public TreeNode helper(int[] n, int s, int e)
    {
        if(s>e)
        return null;
        int mid=(e+s)/2;
        TreeNode t=new TreeNode(n[mid]);
        t.left=helper(n,s,mid-1);
        t.right=helper(n,mid+1,e);
        return t;
    }
}