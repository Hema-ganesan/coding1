public class leftrotatearraybydplace {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,5,7,4};
        int d=3;
        d=d%arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverse(int[] n,int st,int end){
        while(st<end){
            int temp=n[st];
            n[st]=n[end];
            n[end]=temp;
            st++;
            end--;
        }
    }
}
