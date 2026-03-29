import java.util.*;
public class removeduplicates {
    public static void main(String[] args) {
//        Array.sort(arr);
        int arr[]={11,1,2,2,3,0,7,3,6,2,9,5,46,3,43,28,44,67};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
//            System.out.print();
        }
        System.out.print("\n");
        System.out.println(arr.length);
        System.out.print("\n");
        Arrays.sort(arr);
        int i=0;
            for(int j=1;j<arr.length;j++){
                if(arr[j]!=arr[i]) {
                    arr[i+1] = arr[j];
                    i++;
                }

        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.print("\n");
        System.out.println(i);
    }
}
