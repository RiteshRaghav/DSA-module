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
    public int count(List<Integer> arr){
        List<Integer> temp=new ArrayList<>(arr);
        Collections.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.size();i++){
            map.put(arr.get(i),i);
        }
        int swap=0;
        for(int i=0;i<arr.size();i++){
            if(temp.get(i)!=arr.get(i)){

                int idx=map.get(temp.get(i));
                Collections.swap(arr,idx,i);

                map.put(arr.get(idx),idx);
                map.put(arr.get(i),i);
                swap++;
            }
        }
        return swap;
    }
    public int minimumOperations(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            List<Integer> level=new ArrayList<>();
            while(n-->0){
                TreeNode curr=queue.remove();
                level.add(curr.val);
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);

            }
            res.add(level);
        }
         int countSwap=0;
         for(List<Integer> level:res){
               countSwap+=count(level);
         }
         return countSwap;
    }
}