import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr={1,5,3,2,4};
        int n=arr.length;
        int i=0;
        while(i<0){
            int crt=arr[n]-1;
            if(arr[i]!=crt){
                int temp=arr[crt];
                arr[crt]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
