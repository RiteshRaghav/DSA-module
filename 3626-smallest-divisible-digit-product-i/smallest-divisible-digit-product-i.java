class Solution {
    public int productOfDigit(int n){
        int pro=1;
        while(n>0){
            int rem=n%10;
            pro*=rem;
            n=n/10;
        }
        return pro;
    }
    public int smallestNumber(int n, int t) {
         
        while(true){
            int product=productOfDigit(n);
              
             if(product%t==0) return n;
             n++; 
        }
       
    }
}