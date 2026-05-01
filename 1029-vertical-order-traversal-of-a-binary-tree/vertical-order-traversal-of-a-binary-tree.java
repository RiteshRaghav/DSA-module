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
    TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> map=new TreeMap<>();
    public void dfs(TreeNode root,int level,int col){
        if(root==null) return;

        if(!map.containsKey(col)){
            map.put(col,new TreeMap<>());
        }
        if(!map.get(col).containsKey(level)){
            map.get(col).put(level,new ArrayList<>());
        }
        map.get(col).get(level).add(root.val);

        dfs(root.left,level+1,col-1);
        dfs(root.right,level+1,col+1);
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
      if(root==null) return res;
        dfs(root,0,0);
        
        for(int i:map.keySet()){
            TreeMap<Integer,ArrayList<Integer>> sub=map.get(i);
            List<Integer> list=new ArrayList<>();
            for(int j:sub.keySet()){
                ArrayList<Integer> l=sub.get(j);
                Collections.sort(l);
                list.addAll(l);
            }
            res.add(list);
        }
        
        return res;
    }
}