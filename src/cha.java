public class cha {
    public static void main(String[] args) {

        String s = "a1b2c34c3b2cb3a1d";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if((ch>='a' && ch<='z')||(  ch>='A' && ch<='Z')){
                int j;
                for(j=0;j<i;j++){
                    if(s.charAt(j)==ch) {
                        break;
                    }
                  }
                if(j==i){
                    System.out.print(ch);
                }
            }
            else if(ch>='0' && ch<='9'){
                int j=0;;
                for(j=i+1;j<n;j++) {
                    if (s.charAt(j) == ch) {
                        break;
                    }
                }
                    if(j==n) {
                        System.out.print(ch);
                    }
            }
        }
    }
}
