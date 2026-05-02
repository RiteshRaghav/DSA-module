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
    public void attach(TreeNode root, int val){
        if(root==null) return;

        if(root.left==null && root.right==null){
            TreeNode t=new TreeNode(val);
            if(root.val<val){
                root.right=t;
                return;
            }
            else{
                root.left=t;
                return;
            }
        }
        else if(root.val<val){
            if(root.right==null){
                TreeNode t=new TreeNode(val);
                root.right=t;
                return;
            }
            else attach(root.right,val);
        }
        else{
            if(root.left==null){
                TreeNode t=new TreeNode(val);
                root.left=t;
                return;
            }
            else attach(root.left,val);
        }

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        attach(root,val);
        return root;
    }
}