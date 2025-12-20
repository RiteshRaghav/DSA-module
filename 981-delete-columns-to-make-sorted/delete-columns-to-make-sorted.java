class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        int len=strs[0].length();
        for(int i=0;i<len;i++){
            for(int j=1;j<strs.length;j++){
              if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                count++; break;
              }
            }
        }
        return count;
    }
}