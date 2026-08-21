class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> group=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            if(group.containsKey(sorted)){
                group.get(sorted).add(s);
            }
            else{
                group.put(sorted,new ArrayList<>());
                group.get(sorted).add(s);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(String s:group.keySet()){
            res.add(group.get(s));
        }
        return res;
    }
}