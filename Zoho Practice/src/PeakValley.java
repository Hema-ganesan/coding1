import java.util.Arrays;
import java.util.Scanner;

class PeakValley{
    public static   void main(String []args){
        int n=5;
        int[] arr={5,1,3,2,4};
        Arrays.sort(arr);
        int k=2;
        boolean t=false;
        int[] ans=new int[n];
        int mid=arr.length/2;
        int low=0;
        int high=mid;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=arr[high++];
            }
            else{
                ans[i]=arr[low++];
            }
        }
        for(int i=0;i<n-1;i++){
            if(i%2==0){
                if(ans[i]<=ans[i+1]) {
                    t=true;
//                    System.out.print("-1");
                }
            }
            else{
                if(ans[i]>=ans[i+1]) {
                    t=true;
//                    System.out.print("-1");
                }
            }
            if(Math.abs((long)ans[i]-ans[i+1])<k){
                t=true;
//                System.out.print("-1");
            }
        }
        if(!t) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[j] + " ");
            }
        }
        else{
            System.out.println("-1");
        }
    }
}