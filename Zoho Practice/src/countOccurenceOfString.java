import java.util.HashMap;

public class countOccurenceOfString {
//BETTER SOLUTION
//    public static void main(String[] args) {
//        String s="ABCMEBASSX";
//        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
//        for(int i=0;i<s.length();i++){
//            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//        }
//        for (char ch : map.keySet()) {
//            System.out.println(ch + " " + map.get(ch));
//        }
//    }


//OPTIMAL SOLUTION

    public static void main(String[] args) {
        int[] freq=new int[256];
        String s="ABCMEBASSX";
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(freq[a]!=0){
                System.out.print(a+"-"+freq[a]+"-"+(int)s.charAt(i)+"   ");
                freq[a]=0;
            }
        }
    }
}
