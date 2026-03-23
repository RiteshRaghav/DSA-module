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
    int Ncount=0;
    public void count(TreeNode root){
        if(root==null) return;

        Ncount++;
        count(root.left);
        count(root.right);
    }
    public int countNodes(TreeNode root) {
        count(root);
        return Ncount; 
    }
}