public class missingno {
    public static void main(String[] args) {
        //XOR method
        int arr[]={1,2,0};
        int x1 = 0;
        for(int i=0;i<arr.length;i++){
            x1^=arr[i];
        }
        for(int i=0;i<=arr.length;i++){
            x1^=i;
        }
        System.out.println(x1);
    }
}
