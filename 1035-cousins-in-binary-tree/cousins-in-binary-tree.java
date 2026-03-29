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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            while(n-->0){
                TreeNode curr=queue.remove();
                if(curr.left!=null && curr.right!=null){
                if((curr.left.val==x && curr.right.val==y)||(curr.left.val==y && curr.right.val==x)) return false;
                }

                if(curr.val==x || curr.val==y){
                    boolean isfound=false;
                    while(n-->0){
                        int ele=queue.remove().val;
                        if(ele==x || ele==y){
                            isfound=true;
                            break;
                        }
                    }
                    if(isfound) return true;
                    else return false;
                }
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);

            }
        }
        return false;
    }
}