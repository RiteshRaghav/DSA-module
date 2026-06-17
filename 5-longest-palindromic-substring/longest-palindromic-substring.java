class Solution {
    public boolean isPalindrome(int i,int j,String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
       int idx1=0;
       int idx2=0;
       for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            if(isPalindrome(i,j,s)){
                if((idx2-idx1+1)<(j-i+1)){
                    idx1=i;
                    idx2=j;
                }
            }
        }
       }
        return s.substring(idx1,idx2+1);
    }
}