import java.util.Arrays;

public class leftrotatearrayby1place {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,5,7,4};
        int temp=arr[0];
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
      for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
      }
    }
}
