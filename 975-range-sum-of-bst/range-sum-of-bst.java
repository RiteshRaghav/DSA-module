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
   int Sum=0;
   public void sum(TreeNode root, int low, int high){
      if(root==null) return;

      if(root.val>=low && root.val<=high){
         Sum+=root.val;
         sum(root.right,low,high);
         sum(root.left,low,high);
      }

      else if(root.val<=low){
         sum(root.right,low,high);
      }
      else{
        sum(root.left,low,high);
      }
   }
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum(root,low,high);
        return Sum;
    }
}