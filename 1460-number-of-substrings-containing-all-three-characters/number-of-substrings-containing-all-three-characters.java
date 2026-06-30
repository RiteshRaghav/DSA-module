class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int[] last={-1,-1,-1};
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
            if(last[0]!=-1 && last[1]!=-1 && last[2]!=-1){
                int m=Math.min(last[0],last[1]);
                int n=Math.min(last[2],m);
                count=count+1+n;
            }
        }
        
        return count;
    }
}