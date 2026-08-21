class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        } 
        List<Integer> res=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)>(nums.length)/3){
                res.add(i);
            }
        }
        return res;
    }
}