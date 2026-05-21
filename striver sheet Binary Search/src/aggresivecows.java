import java.util.*;
import java.util.Arrays;
public class aggresivecows {
    public static void main(String[] args) {
        int[] arr={13,15,23,14,17,19,20};
        Arrays.sort(arr);
        int n=arr.length;
        int cows=4;
        int l=0;
        int h=arr[n-1]-arr[0];
        while(l<=h){
            int m=l+(h-l)/2;
            if(canweplace(arr,m,cows)==true){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        System.out.println(h);
    }
    static boolean canweplace(int[] a, int m, int cows){
        int cntcows=1;
        int last=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]-last>=m){
                cntcows++;
                last=a[i];
            }

        }
        if(cntcows>=cows){
            return true;
        }
        else {
            return false;
        }
    }
}