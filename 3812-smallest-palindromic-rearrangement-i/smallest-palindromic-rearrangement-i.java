class Solution {
    public String sorting(String s){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);

        String sorted=new String(ch);
        return sorted;
    }
    public String reverse(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public String smallestPalindrome(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        if(n%2==0){
            sb.append(sorting(s.substring(0,(n/2))));
            String temp=sb.toString();
            sb.append(reverse(temp));
        }
        else{
            sb.append(sorting(s.substring(0,n/2)));
            char ch=s.charAt(n/2);
            String temp=sb.toString();
            sb.append(ch);
            sb.append(reverse(temp));
        }
        
        return sb.toString();
    }
}