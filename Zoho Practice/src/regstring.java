class regstring{
    public static void main(String[] args)
    {
        String s="xxabbbcd";
        String p="ab+c";
        for(int st=0;st<s.length();st++){
            int i=st;
            int j=0;
            while(i<s.length() && j<p.length()){
                char ch=p.charAt(j);
                if(j+1<p.length() && (p.charAt(j+1)=='+'|| p.charAt(j+1)=='*')){
                    char op=p.charAt(j+1);
                    int cnt=0;
                    while(i<s.length() && s.charAt(i)==ch){
                        cnt++;
                        i++;
                    }
                    if(op=='+' && cnt==0){
                        break;
                    }
                    j+=2;
                }
                else{
                    if(s.charAt(i)!=ch){
                        break;
                    }
                    i++;
                    j++;
                }
            }
            if(j==p.length()){
                System.out.print( s.substring(st,i));
            }
        }
    }
}