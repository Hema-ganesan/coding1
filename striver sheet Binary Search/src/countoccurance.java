import java.util.*;
public class countoccurance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 5};
        int target = 2;
        int n = arr.length;
        // LOWER BOUND
        int l=0;
        int h=n-1;
        int lb=n;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]>=target){
                lb=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        // UPPER BOUND
        l=0;
        h=n-1;
        int ub=n;
        while(l<=h){
            int m=l+(h-l)/2;
            if (arr[m]>target){
                ub=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        int count=ub-lb;
        System.out.println(count);
    }
}