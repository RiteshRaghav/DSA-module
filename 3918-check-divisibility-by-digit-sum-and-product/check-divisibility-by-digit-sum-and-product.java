class Solution {
    public boolean checkDivisibility(int n) {
        int a=n;
        int dSum=0;
        int dPro=1;
        while(a>0){
            int rem=a%10;
            dSum+=rem;
            dPro*=rem;
            a=a/10;
        }

        int sum=dSum+dPro;
        if((n%sum)==0) return true;
        return false;
    }
}