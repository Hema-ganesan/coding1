import java.util.*;
public class duplicateinsortedarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                arr[j+1]=arr[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
