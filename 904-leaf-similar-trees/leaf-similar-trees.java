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
    public void leafNode(TreeNode root,ArrayList<Integer> tree){
        if(root==null) return;
        if(root.left==null && root.right==null){
            tree.add(root.val);
            return;
        }
        leafNode(root.left,tree);
        leafNode(root.right,tree);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> tree1=new ArrayList<>();
        ArrayList<Integer> tree2=new ArrayList<>();

        leafNode(root1,tree1);
        leafNode(root2,tree2);

        if(tree1.size()!=tree2.size()) return false;

        for(int i=0;i<tree1.size();i++){
           if(!tree1.get(i).equals(tree2.get(i))) return false;
        }
        return true;
    }
}