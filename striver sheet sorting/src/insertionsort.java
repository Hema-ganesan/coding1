import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int arr[]={12,4,5,3,1,9};
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]<arr[i-1]) {
//                int temp = arr[i - 1];
//                arr[i - 1] = arr[i];
//                arr[i] = temp;
//            }
//            System.out.print(arr[i]+" ");
//        }

        for(int i=1;i<arr.length;i++){
            int k=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>k){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=k;
        }
        System.out.print(Arrays.toString(arr));
    }
}


