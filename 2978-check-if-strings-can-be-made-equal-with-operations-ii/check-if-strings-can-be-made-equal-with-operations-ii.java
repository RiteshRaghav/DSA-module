class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] even_idx=new int[27];
        int[] odd_idx=new int[27];

        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                even_idx[s1.charAt(i)-'a']++;
                even_idx[s2.charAt(i)-'a']--;
            }
            else{
                odd_idx[s1.charAt(i)-'a']++;
                odd_idx[s2.charAt(i)-'a']--;
            }
        }

        for(int i=0;i<27;i++){
            if(even_idx[i]!=0 || odd_idx[i]!=0){
                return false;
            }
        }
        return true;
    }
}