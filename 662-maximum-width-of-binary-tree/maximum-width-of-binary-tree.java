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
 class pair{
    TreeNode node;
    int idx;
    pair(TreeNode node,int idx){
        this.node=node;
        this.idx=idx;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
          int maxWidth=0;
          Queue<pair> queue=new LinkedList<>();
          queue.add(new pair(root,0));
  
           int first=0;
           int second=0;
           
          while(!queue.isEmpty()){
            int n=queue.size();
            int i=n;
            while(n>0){
                pair curr=queue.remove();
                if(n==i){
                  first=curr.idx;
                }
                if(n==1){
                  second=curr.idx;
                }
                
                if(curr.node.left!=null) queue.add(new pair(curr.node.left,2*curr.idx+1));
                if(curr.node.right!=null) queue.add(new pair(curr.node.right,2*curr.idx+2));

                n--;
            }
            maxWidth=Math.max(maxWidth,second-first+1);
          }
          return maxWidth;
    }
}