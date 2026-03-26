// Last updated: 26/03/2026, 16:17:45
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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ind=0;
        while (!q.isEmpty()) {
            int n = q.size();
            if(ind%2!=0) // r to l
            {
            int temp=Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                TreeNode t = q.poll();
                if(t.val>=temp)
                return false;
                temp =t.val;
                if(temp%2!=0)
                return false;
                if (t.left != null) 
                q.add(t.left);
                if (t.right != null) 
                q.add(t.right);
            }
            }
            else // l to r
            {
            int temp=0;
             for (int i = 0; i < n; i++) {
                TreeNode t = q.poll();
                if(t.val<=temp)
                return false;
                temp =t.val;
                if(temp%2==0)
                return false;
                
                if (t.left != null) 
                q.add(t.left);
                if (t.right != null) 
                q.add(t.right);
            }   
            }
        ind++;
        }

        return true;
    }
}