// Last updated: 26/03/2026, 16:22:58
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        if(root==null)
        return l;
        Queue <TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> l2=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
            TreeNode t=q.poll(); 
            l2.add(t.val);
            if(t.left!=null)
            {
                q.add(t.left);
            }
            if(t.right!=null)
            {
                q.add(t.right);
            }
            }
            
            l.add(l2);
        }
        return l;
    }
}