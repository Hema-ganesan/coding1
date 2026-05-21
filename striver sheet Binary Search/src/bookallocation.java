import java.util.Arrays;
import java.util.Scanner;

public class bookallocation {
    public static void main(String args[]){
        int a[]={10,23,32,38,21,11,49};
        int h=0;
        int stu=5;
        for(int i=0;i<a.length;i++){
            h+=a[i];
        }
        Arrays.sort(a);
        int l=a[a.length-1];
        System.out.println(books(l,h,a,stu));
    }
    public static int books(int l,int h,int[] a,int stu){
        while(l<h){
            int mid=(l+h)/2;
            int noofstud=numstud(a,mid);
            if(noofstud>stu) {
                l = mid + 1;
            }
            else{
                h=mid-1;
            }
        }
        return l;
    }
    public static int numstud(int[] a,int mid){
        int student=1,pages=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(pages+a[i]<=mid){
                pages+=a[i];
            }
            else{
                student++;
                pages=a[i];
            }
        }
        return student;
    }
}
