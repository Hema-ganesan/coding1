import java.util.Scanner;

class sumofnaturalnum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,3,4,6,5,2};
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=i+1;
            System.out.print(arr[i]+" ");
        }

    }
}