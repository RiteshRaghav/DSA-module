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
    public List<Double> averageOfLevels(TreeNode root) {
       List<Double> res=new ArrayList<>();
       Queue<TreeNode> queue=new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty()){
        double n=queue.size();
        double no=(double)queue.size();
        double sum=0;
        while(n-->0){
            TreeNode curr=queue.remove();
            sum+=(double)curr.val;

            if(curr.left!=null) queue.add(curr.left);
            if(curr.right!=null) queue.add(curr.right);

        }
        double avgs=sum/no;
        res.add(avgs);
       }
       return res;
    }
}