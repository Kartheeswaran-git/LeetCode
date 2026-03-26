// Last updated: 26/03/2026, 16:20:18
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
    public int rob(TreeNode root) {
        int[] choice = helper(root);
        return Math.max(choice[0],choice[1]);
    }
    public int[] helper(TreeNode root){
        if(root==null)return new int[2];

        int[] choice = new int[2];
        int[] leftC = helper(root.left);
        int[] rightC = helper(root.right);

        choice[0] = root.val+leftC[1]+rightC[1];
        
        choice[1] = Math.max(leftC[0],leftC[1])+Math.max(rightC[0],rightC[1]);
        return choice;
    }
}