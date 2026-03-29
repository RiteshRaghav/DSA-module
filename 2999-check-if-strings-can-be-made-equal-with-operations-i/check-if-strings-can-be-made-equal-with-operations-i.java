class Solution {
    public void swap(char[] t,int c1,int c2){
        char temp=t[c1];
        t[c1]=t[c2];
        t[c2]=temp;
    }
    public boolean check( char[] t,String s){
        String dummy=new String(t);
        return dummy.equals(s);
    }
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        char[] t1=s1.toCharArray();
        char[] t2=s2.toCharArray();
        

        // string 1 kai liye
        swap(t1,0,2);
        if(check(t1,s2)) return true;
       swap(t1,0,2);

        swap(t1,1,3);
        if(check(t1,s2)) return true;
        swap(t1,1,3);;

        swap(t1,0,2);
         swap(t1,1,3);
        if(check(t1,s2)) return true;

        // string 2 kai liye
        swap(t2,0,2);
        if(check(t2,s1)) return true;
         swap(t2,0,2);

        swap(t2,1,3);
        if(check(t2,s1)) return true;
         swap(t2,1,3);

         swap(t2,0,2);
         swap(t2,1,3);
        if(check(t2,s1)) return true;


        return false;
    }
}