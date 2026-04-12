import java.util.Arrays;
import java.util.Scanner;

public class merge2 {
    public static void  main(String args[]){
        int a[]={10,20,37,2,1,36};
        a=mergesort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static int[] mergesort(int[] a,int low,int high){
        if(low>=high){
            return a;
        }
        int mid=(low+high)/2;
        int i=low,j=mid+1;
        int k=0;
    }
}
