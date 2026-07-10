import java.util.HashSet;
import java.util.Scanner;

public class longestconsecutivesequence {
    public static void main(String[] args) {
        int cnt=0;
        Scanner sc=new Scanner(System.in);
        int[] arr={1,3,100,101,2};
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int x=0;
        int l=1;
        for(int num:set){
            if(!set.contains(num-1)){
                x=num;
                cnt=1;
                while(set.contains(x+1)){
                    cnt++;
                    x+=1;
                }
            }
            if(cnt>l) {
                l = cnt;
            }
        }
        System.out.println(l);
    }
}
