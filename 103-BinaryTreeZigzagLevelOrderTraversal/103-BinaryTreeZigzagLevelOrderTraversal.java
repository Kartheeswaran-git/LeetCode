// Last updated: 26/03/2026, 16:22:51
// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
//  whats error in this zigzac level order. correct this
// class Solution {
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//         List<List<Integer>> l=new ArrayList<>();
//         if(root==null)
//         return l;
//         Queue <TreeNode> q=new LinkedList<>();
//         q.add(root);
//         int ind=0;
//         while(!q.isEmpty())
//         {
//             int n=q.size();
//             List<Integer> l2=new ArrayList<>();
//             // if(ind%2!=0) //l to r
//             for(int i=0;i<n;i++)
//             {
//             TreeNode t=q.poll(); 
//             l2.add(t.val);
//                if(ind%2!=0) {
//                 if(t.left!=null)
//                 {
//                     q.add(t.left);
//                 }
//                 if(t.right!=null)
//                 {
//                     q.add(t.right);
//                 }}
//                 else
//                 {
//                  if(t.right!=null)
//                 {
//                     q.add(t.right);
//                 }
//                 if(t.left!=null)
//                 {
//                     q.add(t.left);
//                 }   
//                 }
//             }
//             ind++;
//             l.add(l2);
//         }
//         return l;
//     }
// }

//             // else //r to l
//             // for(int i=0;i<n;i++)
//             // {
//             // TreeNode t=q.poll(); 
//             // l2.add(t.val);
//             //     if(t.right!=null)
//             //     {
//             //         q.add(t.right);
//             //     }
//             //     if(t.left!=null)
//             //     {
//             //         q.add(t.left);
//             //     }
//             // }
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean f = true;

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TreeNode t = q.poll();

                if (f) {
                    level.add(t.val);
                } else {
                    level.add(0, t.val);  
                }

                
                if (t.left != null) 
                q.add(t.left);
                if (t.right != null) 
                q.add(t.right);
            }

            result.add(level);
            f = !f;  
        }

        return result;
    }
}
