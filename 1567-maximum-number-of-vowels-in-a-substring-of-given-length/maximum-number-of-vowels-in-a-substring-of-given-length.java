class Solution {
    public boolean iSVowel(int i,char s){
        
            if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u'){
                return true;
            }
        
        return false;
    }
    public int maxVowels(String s, int a) {
        if(s.length()==1 && iSVowel(0,s.charAt(0))) return 1;
        int i=0;
        int j=a-1;
       int cnt=0;
        for(int k=i;k<=j;k++){
            if(s.charAt(k)=='a' || s.charAt(k)=='e' || s.charAt(k)=='i' || s.charAt(k)=='o' || s.charAt(k)=='u'){
                cnt++;
            }
        }
        int maxi=cnt;
        while(j<s.length()){
            if(iSVowel(i,s.charAt(i))){
                cnt--;
            }
            j++;
            if(j<s.length() && iSVowel(j,s.charAt(j))){
                cnt++;
            }
            i++;
            maxi=Math.max(maxi,cnt);
        }
        return maxi;
    }
}