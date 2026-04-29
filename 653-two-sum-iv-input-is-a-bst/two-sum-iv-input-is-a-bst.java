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
    ArrayList<Integer> list=new ArrayList<>();
    public void findEle(TreeNode root){
        if(root==null) return;
        findEle(root.left);
        list.add(root.val);
        findEle(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        findEle(root);
        int i=0;
        int j=list.size()-1;
        while(i>=0 && j<list.size() && i<j){
        if(list.get(i)+list.get(j)==k) return true;
        else if(list.get(i)+list.get(j)<k) i++;
        else j--;
        }
        return false;
    }
}