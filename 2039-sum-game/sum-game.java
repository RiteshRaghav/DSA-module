class Solution {
    public boolean sumGame(String num) {
        double ans=0;
        for(int i=0;i<num.length()/2;i++){
            if(num.charAt(i)=='?'){
                ans+=4.5;
            }
            else{
                ans+=(num.charAt(i)-'0');
            }
        }
         for(int i=num.length()/2;i<num.length();i++){
            if(num.charAt(i)=='?'){
                ans-=4.5;
            }
            else{
                ans-=(num.charAt(i)-'0');
            }
        }
        return ans!=0;
    }
}