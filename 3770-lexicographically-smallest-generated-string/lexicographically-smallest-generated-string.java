class Solution {
    public boolean isSame(char word[],String str,int i,int m){
        for(int j=0;j<m;j++){
            if(word[i++]!=str.charAt(j)) return false;
        }
        return true;
    }
    public String generateString(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();

        int wordLen=n+m-1;
        char word[]=new char[wordLen];
        boolean[] canChange=new boolean[wordLen];

         for(int i=0;i<wordLen;i++){
            word[i]='$';
         }

        for(int i=0;i<n;i++){
            if(str1.charAt(i)=='T'){
                int idx=i;
                 for(int j=0;j<m;j++){
                     if (word[idx] != '$' && word[idx] != str2.charAt(j)) {
                        return "";
                    }
                    word[idx] = str2.charAt(j);
                    idx++;
                 }
            }
        }

        for(int i=0;i<wordLen;i++){
            if(word[i]=='$'){
                word[i]='a';
                canChange[i]=true;
            }
        }

        for(int i=0;i<n;i++){
            if(str1.charAt(i)=='F'){
                if(isSame(word,str2,i,m)){

                    boolean change=false;
                    for(int k=i+m-1;k>=i;k--){
                        if(canChange[k]){
                            change=true;
                            word[k]='b';
                            canChange[k]=false;
                            break;
                        }
                    }
                    if(!change) return "";
                }
            }
        }
        return new String(word);
    }
}