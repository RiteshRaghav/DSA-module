class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st=new HashSet<>();
        int len=0;
        
        int i=0;
        int j=0;
        while(j<s.length()){
            
            while(!st.isEmpty() && st.contains(s.charAt(j))){
                st.remove(s.charAt(i++));
            }
            if(st.isEmpty() || !st.contains(s.charAt(j))){
                st.add(s.charAt(j++));
            }
            len=Math.max(len,st.size());
        }
        return len;
    }
}