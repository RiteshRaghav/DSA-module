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
    int idx;
    public TreeNode solve(int start,int end,int[] inorder,int[] postorder){
        if(start>end) return null;

        int rootVal=postorder[idx--];
        int i=0;
        for(i=start;i<=end;i++){
            if(inorder[i]==rootVal) break;
        }

       
        TreeNode root=new TreeNode(rootVal);
        root.right=solve(i+1,end,inorder,postorder);
        root.left=solve(start,i-1,inorder,postorder);
       

        return root;
    } 
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        idx=n-1;

        return solve(0,n-1,inorder,postorder);
    }
} 