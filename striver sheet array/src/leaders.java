public class leaders {
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,1,6,21};
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i]>max) {
                System.out.println(arr[i]);
                max=arr[i];
            }
        }
    }
}
