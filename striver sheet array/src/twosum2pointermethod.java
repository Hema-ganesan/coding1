import java.util.*;
public class twosum2pointermethod {
    public static void main(String[] args) {
        int arr[]={1,7,9,22,0,2};
        boolean b=false;
        int t=12;
        int l=0,r;
        Arrays.sort(arr);
        for(l=0;l<arr.length;l++){
            for(r=arr.length-1;r>=0;r--){
                if(arr[l]+arr[r]==t) {
                    b = true;
                    break;
                }
            }
        }
        System.out.println(b);
    }
}
