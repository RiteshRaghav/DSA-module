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
    ArrayList<TreeNode> node=new ArrayList<>();
    public void find(TreeNode root,int val){
       if(root==null) return;
        if(root.val==val){ 
            node.add(root);   
        }
        find(root.left,val);
        find(root.right,val);
 
    }
    public boolean isSame(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;

        if(root1.val!=root2.val) return false;

        boolean left=isSame(root1.left,root2.left);
        boolean right=isSame(root1.right,root2.right);

        return left && right;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        find(root,subRoot.val);
        if(node.size()==0) return false;
         
         for(TreeNode n:node){
            if(isSame(n,subRoot)){
                  return true;
            }
         }
         
         return false;
    }
}