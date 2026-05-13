import java.util.*;
public class mergesortedarraysoptsoln2 {
    public static void main(String[] args) {
        int[] a1={1,4,2,6};
        int[] a2={3,7,8,5,9,};
        int n1=a1.length;
        int n2=a2.length;
        int length=n1+n2;
        int gap=(length/2)+(length%2);
        while(gap>0){
            int l=0,r=l+gap;
            while(r<length){
                if(l<n1 &&r>=n1){
                    if(a1[l]>a2[r-n1]){
                        swap(a1,a2,l,r-n1);
                    }
                }
                else if(l>=n1){
                    if(a2[l-n1]>a2[r-n1]){
                        swap(a2,a2,l-n1,r-n1);
                    }
                }
                else{
                    if(a1[l]>a1[r]){
                        swap(a1,a1,l,r);
                    }
                }
                l++;
                r++;
            }
            if(gap==1)
                break;
            gap=(gap/2)+(gap%2);
        }
        System.out.print(Arrays.toString(a1));
        System.out.print(Arrays.toString(a2));
    }
    public static void swap(int[] a1,int[] a2,int l,int r){
        int temp=a1[l];
        a1[l]=a2[r];
        a2[r]=temp;
    }
}

